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
import com.tools20022.repository.area.sese.TransferInConfirmation;
import com.tools20022.repository.area.sese.TransferInInstruction;
import com.tools20022.repository.area.sese.TransferOutConfirmation;
import com.tools20022.repository.area.sese.TransferOutInstruction;
import com.tools20022.repository.choice.PartyIdentification1Choice;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmOwnerIdentification
 * InvestmentAccount10.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountIdentification
 * InvestmentAccount10.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountName
 * InvestmentAccount10.mmAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountDesignation
 * InvestmentAccount10.mmAccountDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmIntermediaryInformation
 * InvestmentAccount10.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmSecuritiesForm
 * InvestmentAccount10.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmDematerialisedIndicator
 * InvestmentAccount10.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmIncomePreference
 * InvestmentAccount10.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmBeneficiaryCertificationIndicator
 * InvestmentAccount10.mmBeneficiaryCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmSafekeepingPlace
 * InvestmentAccount10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountServicer
 * InvestmentAccount10.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#mmAccountDetails
 * TransferInConfirmation.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#mmAccountDetails
 * TransferInInstruction.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#mmAccountDetails
 * TransferOutConfirmation.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#mmAccountDetails
 * TransferOutInstruction.mmAccountDetails}</li>
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
 * "InvestmentAccount10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount10", propOrder = {"ownerIdentification", "accountIdentification", "accountName", "accountDesignation", "intermediaryInformation", "securitiesForm", "dematerialisedIndicator", "incomePreference",
		"beneficiaryCertificationIndicator", "safekeepingPlace", "accountServicer"})
public class InvestmentAccount10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OwnrId")
	protected List<PartyIdentification1Choice> ownerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "OwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerIdentification";
			definition = "Party that legally owns the account.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentification1 accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1
	 * AccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentification1.mmObject();
		}
	};
	@XmlElement(name = "AcctNm")
	protected Max35Text accountName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AcctDsgnt")
	protected Max35Text accountDesignation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
	 * InvestmentAccount.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDsgnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctDsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDesignation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "IntrmyInf")
	protected List<com.tools20022.repository.msg.Intermediary1> intermediaryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary1
	 * Intermediary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryInformation = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Intermediary1.mmObject();
		}
	};
	@XmlElement(name = "SctiesForm")
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form, ie, ownership, of the security, eg, registered or bearer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form, ie, ownership, of the security, eg, registered or bearer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	@XmlElement(name = "DmtrlsdInd")
	protected YesNoIndicator dematerialisedIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
	 * Security.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmtrlsdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDematerialisedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDematerialisedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}
	};
	@XmlElement(name = "BnfcryCertfctnInd")
	protected YesNoIndicator beneficiaryCertificationIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationIndicator
	 * InvestmentAccountService.mmBeneficiaryCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryCertfctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficiaryCertificationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmBeneficiaryCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryCertificationIndicator";
			definition = "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected PartyIdentification1Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place requested as the place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingPlace = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification1Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10
	 * InvestmentAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party related to an account that is not the legal account owner, eg, the power of attorney."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party related to an account that is not the legal account owner, eg, the power of attorney.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount10.mmOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount10.mmAccountIdentification,
						com.tools20022.repository.msg.InvestmentAccount10.mmAccountName, com.tools20022.repository.msg.InvestmentAccount10.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount10.mmIntermediaryInformation,
						com.tools20022.repository.msg.InvestmentAccount10.mmSecuritiesForm, com.tools20022.repository.msg.InvestmentAccount10.mmDematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount10.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentAccount10.mmBeneficiaryCertificationIndicator, com.tools20022.repository.msg.InvestmentAccount10.mmSafekeepingPlace,
						com.tools20022.repository.msg.InvestmentAccount10.mmAccountServicer);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInConfirmation.mmAccountDetails, TransferInInstruction.mmAccountDetails, TransferOutConfirmation.mmAccountDetails, TransferOutInstruction.mmAccountDetails);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount10";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentification1Choice> getOwnerIdentification() {
		return ownerIdentification == null ? ownerIdentification = new ArrayList<>() : ownerIdentification;
	}

	public InvestmentAccount10 setOwnerIdentification(List<PartyIdentification1Choice> ownerIdentification) {
		this.ownerIdentification = Objects.requireNonNull(ownerIdentification);
		return this;
	}

	public AccountIdentification1 getAccountIdentification() {
		return accountIdentification;
	}

	public InvestmentAccount10 setAccountIdentification(com.tools20022.repository.msg.AccountIdentification1 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountName() {
		return accountName == null ? Optional.empty() : Optional.of(accountName);
	}

	public InvestmentAccount10 setAccountName(Max35Text accountName) {
		this.accountName = accountName;
		return this;
	}

	public Optional<Max35Text> getAccountDesignation() {
		return accountDesignation == null ? Optional.empty() : Optional.of(accountDesignation);
	}

	public InvestmentAccount10 setAccountDesignation(Max35Text accountDesignation) {
		this.accountDesignation = accountDesignation;
		return this;
	}

	public List<Intermediary1> getIntermediaryInformation() {
		return intermediaryInformation == null ? intermediaryInformation = new ArrayList<>() : intermediaryInformation;
	}

	public InvestmentAccount10 setIntermediaryInformation(List<com.tools20022.repository.msg.Intermediary1> intermediaryInformation) {
		this.intermediaryInformation = Objects.requireNonNull(intermediaryInformation);
		return this;
	}

	public Optional<FormOfSecurity1Code> getSecuritiesForm() {
		return securitiesForm == null ? Optional.empty() : Optional.of(securitiesForm);
	}

	public InvestmentAccount10 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
		return this;
	}

	public Optional<YesNoIndicator> getDematerialisedIndicator() {
		return dematerialisedIndicator == null ? Optional.empty() : Optional.of(dematerialisedIndicator);
	}

	public InvestmentAccount10 setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = dematerialisedIndicator;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentAccount10 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<YesNoIndicator> getBeneficiaryCertificationIndicator() {
		return beneficiaryCertificationIndicator == null ? Optional.empty() : Optional.of(beneficiaryCertificationIndicator);
	}

	public InvestmentAccount10 setBeneficiaryCertificationIndicator(YesNoIndicator beneficiaryCertificationIndicator) {
		this.beneficiaryCertificationIndicator = beneficiaryCertificationIndicator;
		return this;
	}

	public Optional<PartyIdentification1Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public InvestmentAccount10 setSafekeepingPlace(PartyIdentification1Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<PartyIdentification1Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount10 setAccountServicer(PartyIdentification1Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}