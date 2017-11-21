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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginReport2", propOrder = {"marginProduct", "marginAccount", "collateralisedMarginAccountIndicator", "nonClearingMember", "marginCalculationSummary", "marginCalculation"})
public class MarginReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<MarginProductType1Choice> marginProduct;
	/**
	 * Specifies if the margin is related to equities or fixed income.
	 * <p>
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
	public static final MMMessageAttribute mmMarginProduct = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginProduct;
			componentContext_lazy = () -> MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginProduct";
			definition = "Specifies if the margin is related to equities or fixed income.";
			minOccurs = 0;
			complexType_lazy = () -> MarginProductType1Choice.mmObject();
		}
	};
	protected SecuritiesAccount18 marginAccount;
	/**
	 * Identifies the clearing member's account.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMarginAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccount";
			definition = "Identifies the clearing member's account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount18.mmObject();
		}
	};
	protected YesNoIndicator collateralisedMarginAccountIndicator;
	/**
	 * Used to indicate whether the reported margin account is collateralised or
	 * not. If not collateralised, the account is configured for informational
	 * reporting.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralisedMarginAccountIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmCollateralisedMarginAccountIndicator;
			componentContext_lazy = () -> MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "CollsdMrgnAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentificationAndAccount31> nonClearingMember;
	/**
	 * Provides details about the non clearing member identification and
	 * account.
	 * <p>
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
	public static final MMMessageAssociationEnd mmNonClearingMember = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides details about the non clearing member identification and account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount31.mmObject();
		}
	};
	protected MarginCalculation1 marginCalculationSummary;
	/**
	 * Provides the margin calculation summary per margin account.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMarginCalculationSummary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnClctnSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCalculationSummary";
			definition = "Provides the margin calculation summary per margin account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginCalculation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MarginCalculation2> marginCalculation;
	/**
	 * Provides the margin details such as the exposure amount and the initial
	 * margin.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMarginCalculation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginReport2.mmObject();
			isDerived = false;
			xmlTag = "MrgnClctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCalculation";
			definition = "Provides the margin details such as the exposure amount and the initial margin.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginReport2.mmMarginProduct, MarginReport2.mmMarginAccount, MarginReport2.mmCollateralisedMarginAccountIndicator, MarginReport2.mmNonClearingMember,
						MarginReport2.mmMarginCalculationSummary, MarginReport2.mmMarginCalculation);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginReportV02.mmReportDetails);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginReport2";
				definition = "Provides the details on the margin report per margin account, and optionally per non-clearing member.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MrgnPdct")
	public List<MarginProductType1Choice> getMarginProduct() {
		return marginProduct;
	}

	public void setMarginProduct(List<MarginProductType1Choice> marginProduct) {
		this.marginProduct = marginProduct;
	}

	@XmlElement(name = "MrgnAcct", required = true)
	public SecuritiesAccount18 getMarginAccount() {
		return marginAccount;
	}

	public void setMarginAccount(com.tools20022.repository.msg.SecuritiesAccount18 marginAccount) {
		this.marginAccount = marginAccount;
	}

	@XmlElement(name = "CollsdMrgnAcctInd")
	public YesNoIndicator getCollateralisedMarginAccountIndicator() {
		return collateralisedMarginAccountIndicator;
	}

	public void setCollateralisedMarginAccountIndicator(YesNoIndicator collateralisedMarginAccountIndicator) {
		this.collateralisedMarginAccountIndicator = collateralisedMarginAccountIndicator;
	}

	@XmlElement(name = "NonClrMmb")
	public List<PartyIdentificationAndAccount31> getNonClearingMember() {
		return nonClearingMember;
	}

	public void setNonClearingMember(List<com.tools20022.repository.msg.PartyIdentificationAndAccount31> nonClearingMember) {
		this.nonClearingMember = nonClearingMember;
	}

	@XmlElement(name = "MrgnClctnSummry")
	public MarginCalculation1 getMarginCalculationSummary() {
		return marginCalculationSummary;
	}

	public void setMarginCalculationSummary(com.tools20022.repository.msg.MarginCalculation1 marginCalculationSummary) {
		this.marginCalculationSummary = marginCalculationSummary;
	}

	@XmlElement(name = "MrgnClctn", required = true)
	public List<MarginCalculation2> getMarginCalculation() {
		return marginCalculation;
	}

	public void setMarginCalculation(List<com.tools20022.repository.msg.MarginCalculation2> marginCalculation) {
		this.marginCalculation = marginCalculation;
	}
}