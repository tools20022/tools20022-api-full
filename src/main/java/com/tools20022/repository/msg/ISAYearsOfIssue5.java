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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CurrentYearType1Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.entity.SubscriptionExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PreviousYear3;
import com.tools20022.repository.msg.SubscriptionInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Year in which the ISA plan is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCurrentYear
 * ISAYearsOfIssue5.mmCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCashComponentIndicator
 * ISAYearsOfIssue5.mmCashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmPreviousYears
 * ISAYearsOfIssue5.mmPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue5.mmCurrentYearSubscriptionDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISAYearsOfIssue5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Year in which the ISA plan is issued."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentYearRule#forISAYearsOfIssue5
 * ConstraintCurrentYearRule.forISAYearsOfIssue5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISAYearsOfIssue5", propOrder = {"currentYear", "cashComponentIndicator", "previousYears", "currentYearSubscriptionDetails"})
public class ISAYearsOfIssue5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurYr")
	protected CurrentYearType1Choice currentYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice
	 * CurrentYearType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
	 * PortfolioTransfer.mmCurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
	 * ISAYearsOfIssue5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISA that was issued during the current fiscal year."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISAYearsOfIssue5, Optional<CurrentYearType1Choice>> mmCurrentYear = new MMMessageAttribute<ISAYearsOfIssue5, Optional<CurrentYearType1Choice>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue5.mmObject();
			isDerived = false;
			xmlTag = "CurYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYear";
			definition = "ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrentYearType1Choice.mmObject();
		}

		@Override
		public Optional<CurrentYearType1Choice> getValue(ISAYearsOfIssue5 obj) {
			return obj.getCurrentYear();
		}

		@Override
		public void setValue(ISAYearsOfIssue5 obj, Optional<CurrentYearType1Choice> value) {
			obj.setCurrentYear(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
	 * ISAYearsOfIssue5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshCmpntInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the ISA contains a cash component asset for transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISAYearsOfIssue5, YesNoIndicator> mmCashComponentIndicator = new MMMessageAttribute<ISAYearsOfIssue5, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCashComponentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue5.mmObject();
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
		public YesNoIndicator getValue(ISAYearsOfIssue5 obj) {
			return obj.getCashComponentIndicator();
		}

		@Override
		public void setValue(ISAYearsOfIssue5 obj, YesNoIndicator value) {
			obj.setCashComponentIndicator(value);
		}
	};
	@XmlElement(name = "PrvsYrs")
	protected PreviousYear3 previousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PreviousYear3
	 * PreviousYear3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
	 * ISAYearsOfIssue5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsYrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selection of investment plans issued during previous years."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ISAYearsOfIssue5, Optional<PreviousYear3>> mmPreviousYears = new MMMessageAssociationEnd<ISAYearsOfIssue5, Optional<PreviousYear3>>() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue5.mmObject();
			isDerived = false;
			xmlTag = "PrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PreviousYear3.mmObject();
		}

		@Override
		public Optional<PreviousYear3> getValue(ISAYearsOfIssue5 obj) {
			return obj.getPreviousYears();
		}

		@Override
		public void setValue(ISAYearsOfIssue5 obj, Optional<PreviousYear3> value) {
			obj.setPreviousYears(value.orElse(null));
		}
	};
	@XmlElement(name = "CurYrSbcptDtls", required = true)
	protected SubscriptionInformation1 currentYearSubscriptionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
	 * ISAYearsOfIssue5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYrSbcptDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearSubscriptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amounts already subscribed for the current year."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ISAYearsOfIssue5, SubscriptionInformation1> mmCurrentYearSubscriptionDetails = new MMMessageAssociationEnd<ISAYearsOfIssue5, SubscriptionInformation1>() {
		{
			businessComponentTrace_lazy = () -> SubscriptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue5.mmObject();
			isDerived = false;
			xmlTag = "CurYrSbcptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearSubscriptionDetails";
			definition = "Specifies the amounts already subscribed for the current year.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SubscriptionInformation1.mmObject();
		}

		@Override
		public SubscriptionInformation1 getValue(ISAYearsOfIssue5 obj) {
			return obj.getCurrentYearSubscriptionDetails();
		}

		@Override
		public void setValue(ISAYearsOfIssue5 obj, SubscriptionInformation1 value) {
			obj.setCurrentYearSubscriptionDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue5.mmCurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue5.mmCashComponentIndicator,
						com.tools20022.repository.msg.ISAYearsOfIssue5.mmPreviousYears, com.tools20022.repository.msg.ISAYearsOfIssue5.mmCurrentYearSubscriptionDetails);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentYearRule.forISAYearsOfIssue5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISAYearsOfIssue5";
				definition = "Year in which the ISA plan is issued.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CurrentYearType1Choice> getCurrentYear() {
		return currentYear == null ? Optional.empty() : Optional.of(currentYear);
	}

	public ISAYearsOfIssue5 setCurrentYear(CurrentYearType1Choice currentYear) {
		this.currentYear = currentYear;
		return this;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public ISAYearsOfIssue5 setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = Objects.requireNonNull(cashComponentIndicator);
		return this;
	}

	public Optional<PreviousYear3> getPreviousYears() {
		return previousYears == null ? Optional.empty() : Optional.of(previousYears);
	}

	public ISAYearsOfIssue5 setPreviousYears(PreviousYear3 previousYears) {
		this.previousYears = previousYears;
		return this;
	}

	public SubscriptionInformation1 getCurrentYearSubscriptionDetails() {
		return currentYearSubscriptionDetails;
	}

	public ISAYearsOfIssue5 setCurrentYearSubscriptionDetails(SubscriptionInformation1 currentYearSubscriptionDetails) {
		this.currentYearSubscriptionDetails = Objects.requireNonNull(currentYearSubscriptionDetails);
		return this;
	}
}