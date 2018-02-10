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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.CommissionWaiver;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2#mmInstructionBasis
 * CommissionWaiver2.mmInstructionBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver2#mmWaivedRate
 * CommissionWaiver2.mmWaivedRate}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionWaiver2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Non-enforcement of the right to all or part of a commission by the party entitled to the commission."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommissionWaiver2", propOrder = {"instructionBasis", "waivedRate"})
public class CommissionWaiver2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrBsis", required = true)
	protected WaivingType1 instructionBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.WaivingType1
	 * WaivingType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmInstructionBasis
	 * CommissionWaiver.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2
	 * CommissionWaiver2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommissionWaiver2.mmObject();
			isDerived = false;
			xmlTag = "InstrBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionBasis";
			definition = "Form of the rebate, eg, cash.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.WaivingType1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2
	 * CommissionWaiver2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWaivedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommissionWaiver.mmWaivedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommissionWaiver2.mmObject();
			isDerived = false;
			xmlTag = "WvdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaivedRate";
			definition = "Proportion of the commission that is waived, ie, if the commission is 5% and half is waived, 2.5% should be stated in this field.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommissionWaiver2.mmInstructionBasis, com.tools20022.repository.msg.CommissionWaiver2.mmWaivedRate);
				trace_lazy = () -> CommissionWaiver.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionWaiver2";
				definition = "Non-enforcement of the right to all or part of a commission by the party entitled to the commission.";
			}
		});
		return mmObject_lazy.get();
	}

	public WaivingType1 getInstructionBasis() {
		return instructionBasis;
	}

	public CommissionWaiver2 setInstructionBasis(com.tools20022.repository.msg.WaivingType1 instructionBasis) {
		this.instructionBasis = Objects.requireNonNull(instructionBasis);
		return this;
	}

	public PercentageRate getWaivedRate() {
		return waivedRate;
	}

	public CommissionWaiver2 setWaivedRate(PercentageRate waivedRate) {
		this.waivedRate = Objects.requireNonNull(waivedRate);
		return this;
	}
}