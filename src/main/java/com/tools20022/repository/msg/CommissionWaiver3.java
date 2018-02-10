/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.WaivingInstruction1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.CommissionWaiver;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Non-enforcement of the right to all or part of a commission by the party
 * entitled to the commission.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#InstructionBasisOrExtendedInstructionBasisRule
 * CommissionWaiver3.InstructionBasisOrExtendedInstructionBasisRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmInstructionBasis
 * CommissionWaiver3.mmInstructionBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmExtendedInstructionBasis
 * CommissionWaiver3.mmExtendedInstructionBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmWaivedRate
 * CommissionWaiver3.mmWaivedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommissionWaiver
 * CommissionWaiver}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionWaiver3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Non-enforcement of the right to all or part of a commission by the party entitled to the commission."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver4
 * CommissionWaiver4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommissionWaiver3", propOrder = {"instructionBasis", "extendedInstructionBasis", "waivedRate"})
public class CommissionWaiver3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrBsis", required = true)
	protected WaivingInstruction1Code instructionBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction1Code
	 * WaivingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmInstructionBasis
	 * CommissionWaiver.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3
	 * CommissionWaiver3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of the rebate, eg, cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommissionWaiver.mmInstructionBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommissionWaiver3.mmObject();
			isDerived = false;
			xmlTag = "InstrBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionBasis";
			definition = "Form of the rebate, eg, cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WaivingInstruction1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedInstrBsis", required = true)
	protected Extended350Code extendedInstructionBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmInstructionBasis
	 * CommissionWaiver.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3
	 * CommissionWaiver3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedInstrBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedInstructionBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of the rebate, eg, cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedInstructionBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommissionWaiver.mmInstructionBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommissionWaiver3.mmObject();
			isDerived = false;
			xmlTag = "XtndedInstrBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedInstructionBasis";
			definition = "Form of the rebate, eg, cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "WvdRate", required = true)
	protected PercentageRate waivedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmWaivedRate
	 * CommissionWaiver.mmWaivedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3
	 * CommissionWaiver3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WvdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaivedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proportion of the commission that is waived, ie, if the commission is 5% and half is waived, 2.5% should be stated in this field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver4#mmWaivedRate
	 * CommissionWaiver4.mmWaivedRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWaivedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommissionWaiver.mmWaivedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommissionWaiver3.mmObject();
			isDerived = false;
			xmlTag = "WvdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaivedRate";
			definition = "Proportion of the commission that is waived, ie, if the commission is 5% and half is waived, 2.5% should be stated in this field.";
			nextVersions_lazy = () -> Arrays.asList(CommissionWaiver4.mmWaivedRate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Either InstructionBasis or ExtendedInstructionBasis must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3
	 * CommissionWaiver3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmInstructionBasis
	 * CommissionWaiver3.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmExtendedInstructionBasis
	 * CommissionWaiver3.mmExtendedInstructionBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionBasisOrExtendedInstructionBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InstructionBasis or ExtendedInstructionBasis must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor InstructionBasisOrExtendedInstructionBasisRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionBasisOrExtendedInstructionBasisRule";
			definition = "Either InstructionBasis or ExtendedInstructionBasis must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.CommissionWaiver3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommissionWaiver3.mmInstructionBasis, com.tools20022.repository.msg.CommissionWaiver3.mmExtendedInstructionBasis);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommissionWaiver3.mmInstructionBasis, com.tools20022.repository.msg.CommissionWaiver3.mmExtendedInstructionBasis,
						com.tools20022.repository.msg.CommissionWaiver3.mmWaivedRate);
				trace_lazy = () -> CommissionWaiver.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CommissionWaiver3";
				definition = "Non-enforcement of the right to all or part of a commission by the party entitled to the commission.";
				nextVersions_lazy = () -> Arrays.asList(CommissionWaiver4.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommissionWaiver3.InstructionBasisOrExtendedInstructionBasisRule);
			}
		});
		return mmObject_lazy.get();
	}

	public WaivingInstruction1Code getInstructionBasis() {
		return instructionBasis;
	}

	public CommissionWaiver3 setInstructionBasis(WaivingInstruction1Code instructionBasis) {
		this.instructionBasis = Objects.requireNonNull(instructionBasis);
		return this;
	}

	public Extended350Code getExtendedInstructionBasis() {
		return extendedInstructionBasis;
	}

	public CommissionWaiver3 setExtendedInstructionBasis(Extended350Code extendedInstructionBasis) {
		this.extendedInstructionBasis = Objects.requireNonNull(extendedInstructionBasis);
		return this;
	}

	public PercentageRate getWaivedRate() {
		return waivedRate;
	}

	public CommissionWaiver3 setWaivedRate(PercentageRate waivedRate) {
		this.waivedRate = Objects.requireNonNull(waivedRate);
		return this;
	}
}