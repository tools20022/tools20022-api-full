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
import com.tools20022.repository.datatype.ISOYear;
import com.tools20022.repository.datatype.PreviousAll;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between selected investment plans issued during previous years or the
 * entirety of the investment plans.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreviousYear1#AllPreviousYearsOrSpecificPreviousYearsRule
 * PreviousYear1.AllPreviousYearsOrSpecificPreviousYearsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmAllPreviousYears
 * PreviousYear1.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmSpecificPreviousYears
 * PreviousYear1.mmSpecificPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmCashComponentIndicator
 * PreviousYear1.mmCashComponentIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSpecificPreviousYearsGuideline#forPreviousYear1
 * ConstraintSpecificPreviousYearsGuideline.forPreviousYear1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreviousYear1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between selected investment plans issued during previous years or the entirety of the investment plans."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PreviousYear1", propOrder = {"allPreviousYears", "specificPreviousYears", "cashComponentIndicator"})
public class PreviousYear1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AllPrvsYrs", required = true)
	protected PreviousAll allPreviousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PreviousAll
	 * PreviousAll}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1 PreviousYear1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllPrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllPreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Selection ot the entirety of the investment plans."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PreviousYear1, PreviousAll> mmAllPreviousYears = new MMMessageAttribute<PreviousYear1, PreviousAll>() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PreviousYear1.mmObject();
			isDerived = false;
			xmlTag = "AllPrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllPreviousYears";
			definition = "Selection ot the entirety of the investment plans.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreviousAll.mmObject();
		}

		@Override
		public PreviousAll getValue(PreviousYear1 obj) {
			return obj.getAllPreviousYears();
		}

		@Override
		public void setValue(PreviousYear1 obj, PreviousAll value) {
			obj.setAllPreviousYears(value);
		}
	};
	@XmlElement(name = "SpcfcPrvsYrs", required = true)
	protected List<ISOYear> specificPreviousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
	 * PortfolioTransfer.mmTransferredYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1 PreviousYear1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpcfcPrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificPreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selection of investment plans issued during previous years."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PreviousYear1, List<ISOYear>> mmSpecificPreviousYears = new MMMessageAttribute<PreviousYear1, List<ISOYear>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredYear;
			componentContext_lazy = () -> com.tools20022.repository.msg.PreviousYear1.mmObject();
			isDerived = false;
			xmlTag = "SpcfcPrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificPreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}

		@Override
		public List<ISOYear> getValue(PreviousYear1 obj) {
			return obj.getSpecificPreviousYears();
		}

		@Override
		public void setValue(PreviousYear1 obj, List<ISOYear> value) {
			obj.setSpecificPreviousYears(value);
		}
	};
	@XmlElement(name = "CshCmpntInd", required = true)
	protected YesNoIndicator cashComponentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCashComponentIndicator
	 * PortfolioTransfer.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1 PreviousYear1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshCmpntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the ISA contains a cash component asset for transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PreviousYear1, YesNoIndicator> mmCashComponentIndicator = new MMMessageAttribute<PreviousYear1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCashComponentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PreviousYear1.mmObject();
			isDerived = false;
			xmlTag = "CshCmpntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether the ISA contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PreviousYear1 obj) {
			return obj.getCashComponentIndicator();
		}

		@Override
		public void setValue(PreviousYear1 obj, YesNoIndicator value) {
			obj.setCashComponentIndicator(value);
		}
	};
	/**
	 * Either AllPreviousYears or one or more occurrences of
	 * SpecificPreviousYears must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1 PreviousYear1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmAllPreviousYears
	 * PreviousYear1.mmAllPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmSpecificPreviousYears
	 * PreviousYear1.mmSpecificPreviousYears}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllPreviousYearsOrSpecificPreviousYearsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AllPreviousYears or one or more occurrences of SpecificPreviousYears must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor AllPreviousYearsOrSpecificPreviousYearsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllPreviousYearsOrSpecificPreviousYearsRule";
			definition = "Either AllPreviousYears or one or more occurrences of SpecificPreviousYears must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PreviousYear1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PreviousYear1.mmAllPreviousYears, com.tools20022.repository.msg.PreviousYear1.mmSpecificPreviousYears);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PreviousYear1.mmAllPreviousYears, com.tools20022.repository.msg.PreviousYear1.mmSpecificPreviousYears,
						com.tools20022.repository.msg.PreviousYear1.mmCashComponentIndicator);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSpecificPreviousYearsGuideline.forPreviousYear1);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PreviousYear1";
				definition = "Choice between selected investment plans issued during previous years or the entirety of the investment plans.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PreviousYear1.AllPreviousYearsOrSpecificPreviousYearsRule);
			}
		});
		return mmObject_lazy.get();
	}

	public PreviousAll getAllPreviousYears() {
		return allPreviousYears;
	}

	public PreviousYear1 setAllPreviousYears(PreviousAll allPreviousYears) {
		this.allPreviousYears = Objects.requireNonNull(allPreviousYears);
		return this;
	}

	public List<ISOYear> getSpecificPreviousYears() {
		return specificPreviousYears == null ? specificPreviousYears = new ArrayList<>() : specificPreviousYears;
	}

	public PreviousYear1 setSpecificPreviousYears(List<ISOYear> specificPreviousYears) {
		this.specificPreviousYears = Objects.requireNonNull(specificPreviousYears);
		return this;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public PreviousYear1 setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = Objects.requireNonNull(cashComponentIndicator);
		return this;
	}
}