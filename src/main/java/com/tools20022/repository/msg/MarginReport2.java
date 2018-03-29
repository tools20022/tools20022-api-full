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
import com.tools20022.repository.area.secl.MarginReportV02;
import com.tools20022.repository.choice.MarginProductType1Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarginCalculation1;
import com.tools20022.repository.msg.MarginCalculation2;
import com.tools20022.repository.msg.PartyIdentificationAndAccount31;
import com.tools20022.repository.msg.SecuritiesAccount18;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details on the margin report per margin account, and optionally
 * per non-clearing member.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginProduct
 * MarginReport2.mmMarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginAccount
 * MarginReport2.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmCollateralisedMarginAccountIndicator
 * MarginReport2.mmCollateralisedMarginAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmNonClearingMember
 * MarginReport2.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginCalculationSummary
 * MarginReport2.mmMarginCalculationSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginCalculation
 * MarginReport2.mmMarginCalculation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmReportDetails
 * MarginReportV02.mmReportDetails}</li>
 * </ul>
 * </li>
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
 * "MarginReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details on the margin report per margin account, and optionally per non-clearing member."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginReport2", propOrder = {"marginProduct", "marginAccount", "collateralisedMarginAccountIndicator", "nonClearingMember", "marginCalculationSummary", "marginCalculation"})
public class MarginReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnPdct")
	protected List<MarginProductType1Choice> marginProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginProductType1Choice
	 * MarginProductType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginProduct
	 * MarginCall.mmMarginProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the margin is related to equities or fixed income."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginReport2, List<MarginProductType1Choice>> mmMarginProduct = new MMMessageAttribute<MarginReport2, List<MarginProductType1Choice>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginProduct";
			definition = "Specifies if the margin is related to equities or fixed income.";
			minOccurs = 0;
			complexType_lazy = () -> MarginProductType1Choice.mmObject();
		}

		@Override
		public List<MarginProductType1Choice> getValue(MarginReport2 obj) {
			return obj.getMarginProduct();
		}

		@Override
		public void setValue(MarginReport2 obj, List<MarginProductType1Choice> value) {
			obj.setMarginProduct(value);
		}
	};
	@XmlElement(name = "MrgnAcct", required = true)
	protected SecuritiesAccount18 marginAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount18
	 * SecuritiesAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the clearing member's account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginReport2, SecuritiesAccount18> mmMarginAccount = new MMMessageAssociationEnd<MarginReport2, SecuritiesAccount18>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccount";
			definition = "Identifies the clearing member's account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount18.mmObject();
		}

		@Override
		public SecuritiesAccount18 getValue(MarginReport2 obj) {
			return obj.getMarginAccount();
		}

		@Override
		public void setValue(MarginReport2 obj, SecuritiesAccount18 value) {
			obj.setMarginAccount(value);
		}
	};
	@XmlElement(name = "CollsdMrgnAcctInd")
	protected YesNoIndicator collateralisedMarginAccountIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralisedMarginAccountIndicator
	 * MarginCall.mmCollateralisedMarginAccountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollsdMrgnAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMarginAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginReport2, Optional<YesNoIndicator>> mmCollateralisedMarginAccountIndicator = new MMMessageAttribute<MarginReport2, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmCollateralisedMarginAccountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "CollsdMrgnAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(MarginReport2 obj) {
			return obj.getCollateralisedMarginAccountIndicator();
		}

		@Override
		public void setValue(MarginReport2 obj, Optional<YesNoIndicator> value) {
			obj.setCollateralisedMarginAccountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NonClrMmb")
	protected List<PartyIdentificationAndAccount31> nonClearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the non clearing member identification and account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginReport2, List<PartyIdentificationAndAccount31>> mmNonClearingMember = new MMMessageAssociationEnd<MarginReport2, List<PartyIdentificationAndAccount31>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides details about the non clearing member identification and account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount31.mmObject();
		}

		@Override
		public List<PartyIdentificationAndAccount31> getValue(MarginReport2 obj) {
			return obj.getNonClearingMember();
		}

		@Override
		public void setValue(MarginReport2 obj, List<PartyIdentificationAndAccount31> value) {
			obj.setNonClearingMember(value);
		}
	};
	@XmlElement(name = "MrgnClctnSummry")
	protected MarginCalculation1 marginCalculationSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnClctnSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCalculationSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the margin calculation summary per margin account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginReport2, Optional<MarginCalculation1>> mmMarginCalculationSummary = new MMMessageAssociationEnd<MarginReport2, Optional<MarginCalculation1>>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnClctnSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCalculationSummary";
			definition = "Provides the margin calculation summary per margin account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginCalculation1.mmObject();
		}

		@Override
		public Optional<MarginCalculation1> getValue(MarginReport2 obj) {
			return obj.getMarginCalculationSummary();
		}

		@Override
		public void setValue(MarginReport2 obj, Optional<MarginCalculation1> value) {
			obj.setMarginCalculationSummary(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnClctn", required = true)
	protected List<MarginCalculation2> marginCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the margin details such as the exposure amount and the initial margin."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginReport2, List<MarginCalculation2>> mmMarginCalculation = new MMMessageAssociationEnd<MarginReport2, List<MarginCalculation2>>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnClctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCalculation";
			definition = "Provides the margin details such as the exposure amount and the initial margin.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginCalculation2.mmObject();
		}

		@Override
		public List<MarginCalculation2> getValue(MarginReport2 obj) {
			return obj.getMarginCalculation();
		}

		@Override
		public void setValue(MarginReport2 obj, List<MarginCalculation2> value) {
			obj.setMarginCalculation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginReport2.mmMarginProduct, com.tools20022.repository.msg.MarginReport2.mmMarginAccount,
						com.tools20022.repository.msg.MarginReport2.mmCollateralisedMarginAccountIndicator, com.tools20022.repository.msg.MarginReport2.mmNonClearingMember,
						com.tools20022.repository.msg.MarginReport2.mmMarginCalculationSummary, com.tools20022.repository.msg.MarginReport2.mmMarginCalculation);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginReportV02.mmReportDetails);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginReport2";
				definition = "Provides the details on the margin report per margin account, and optionally per non-clearing member.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<MarginProductType1Choice> getMarginProduct() {
		return marginProduct == null ? marginProduct = new ArrayList<>() : marginProduct;
	}

	public MarginReport2 setMarginProduct(List<MarginProductType1Choice> marginProduct) {
		this.marginProduct = Objects.requireNonNull(marginProduct);
		return this;
	}

	public SecuritiesAccount18 getMarginAccount() {
		return marginAccount;
	}

	public MarginReport2 setMarginAccount(SecuritiesAccount18 marginAccount) {
		this.marginAccount = Objects.requireNonNull(marginAccount);
		return this;
	}

	public Optional<YesNoIndicator> getCollateralisedMarginAccountIndicator() {
		return collateralisedMarginAccountIndicator == null ? Optional.empty() : Optional.of(collateralisedMarginAccountIndicator);
	}

	public MarginReport2 setCollateralisedMarginAccountIndicator(YesNoIndicator collateralisedMarginAccountIndicator) {
		this.collateralisedMarginAccountIndicator = collateralisedMarginAccountIndicator;
		return this;
	}

	public List<PartyIdentificationAndAccount31> getNonClearingMember() {
		return nonClearingMember == null ? nonClearingMember = new ArrayList<>() : nonClearingMember;
	}

	public MarginReport2 setNonClearingMember(List<PartyIdentificationAndAccount31> nonClearingMember) {
		this.nonClearingMember = Objects.requireNonNull(nonClearingMember);
		return this;
	}

	public Optional<MarginCalculation1> getMarginCalculationSummary() {
		return marginCalculationSummary == null ? Optional.empty() : Optional.of(marginCalculationSummary);
	}

	public MarginReport2 setMarginCalculationSummary(MarginCalculation1 marginCalculationSummary) {
		this.marginCalculationSummary = marginCalculationSummary;
		return this;
	}

	public List<MarginCalculation2> getMarginCalculation() {
		return marginCalculation == null ? marginCalculation = new ArrayList<>() : marginCalculation;
	}

	public MarginReport2 setMarginCalculation(List<MarginCalculation2> marginCalculation) {
		this.marginCalculation = Objects.requireNonNull(marginCalculation);
		return this;
	}
}