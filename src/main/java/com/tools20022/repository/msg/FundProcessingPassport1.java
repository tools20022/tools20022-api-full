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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.FundProcessingPassportReportV02;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Fund Processing Passsport (FPP) is a fully harmonised document with all key
 * operational information that fund promoters should provide on their
 * investment funds in order to facilitate their trading.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmUpdatedDate
 * FundProcessingPassport1.mmUpdatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmSecurityIdentification
 * FundProcessingPassport1.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmMainFundOrderDesk
 * FundProcessingPassport1.mmMainFundOrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmFundManagementCompany
 * FundProcessingPassport1.mmFundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmFundDetails
 * FundProcessingPassport1.mmFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmValuationDealingCharacteristics
 * FundProcessingPassport1.mmValuationDealingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmInvestmentRestrictions
 * FundProcessingPassport1.mmInvestmentRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmSubscriptionProcessingCharacteristics
 * FundProcessingPassport1.mmSubscriptionProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmRedemptionProcessingCharacteristics
 * FundProcessingPassport1.mmRedemptionProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmSettlementDetails
 * FundProcessingPassport1.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmLocalMarketAnnex
 * FundProcessingPassport1.mmLocalMarketAnnex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmExtension
 * FundProcessingPassport1.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFund
 * InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02#mmFundProcessingPassport
 * FundProcessingPassportReportV02.mmFundProcessingPassport}</li>
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
 * "FundProcessingPassport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Fund Processing Passsport (FPP) is a fully harmonised document with all key operational information that fund promoters should provide on their investment funds in order to facilitate their trading."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FundProcessingPassport1", propOrder = {"updatedDate", "securityIdentification", "mainFundOrderDesk", "fundManagementCompany", "fundDetails", "valuationDealingCharacteristics", "investmentRestrictions",
		"subscriptionProcessingCharacteristics", "redemptionProcessingCharacteristics", "settlementDetails", "localMarketAnnex", "extension"})
public class FundProcessingPassport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UpdatedDate updatedDate;
	/**
	 * Date of last revision.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UpdatedDate
	 * UpdatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdtdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of last revision."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdatedDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "UpdtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdatedDate";
			definition = "Date of last revision.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedDate.mmObject();
		}
	};
	protected SecurityIdentification1 securityIdentification;
	/**
	 * Financial instruments representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1
	 * SecurityIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification1.mmObject();
		}
	};
	protected ContactAttributes1 mainFundOrderDesk;
	/**
	 * Principal entity appointed by the fund, to which orders should be
	 * submitted. Usually located in the country of domicile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactAttributes1
	 * ContactAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmOrderDesk
	 * InvestmentFund.mmOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MainFndOrdrDsk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainFundOrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal entity appointed by the fund, to which orders should be submitted. Usually located in the country of domicile."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMainFundOrderDesk = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmOrderDesk;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "MainFndOrdrDsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainFundOrderDesk";
			definition = "Principal entity appointed by the fund, to which orders should be submitted. Usually located in the country of domicile.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactAttributes1.mmObject();
		}
	};
	protected ContactAttributes1 fundManagementCompany;
	/**
	 * Company that is responsible for the management and operation of the fund,
	 * eg, determines the investment strategy, appoints<br>
	 * the service providers, and makes major decisions for the fund. It is
	 * usually responsible for the distribution and marketing<br>
	 * of the fund. For self-managed funds, this wlll often be a separate
	 * promoter or sponsor of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactAttributes1
	 * ContactAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndMgmtCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Company that is responsible for the management and operation of the fund, eg, determines the investment strategy, appoints\r\nthe service providers, and makes major decisions for the fund. It is usually responsible for the distribution and marketing\r\nof the fund. For self-managed funds, this wlll often be a separate promoter or sponsor of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundManagementCompany = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "FndMgmtCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			definition = "Company that is responsible for the management and operation of the fund, eg, determines the investment strategy, appoints\r\nthe service providers, and makes major decisions for the fund. It is usually responsible for the distribution and marketing\r\nof the fund. For self-managed funds, this wlll often be a separate promoter or sponsor of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactAttributes1.mmObject();
		}
	};
	protected FinancialInstrument20 fundDetails;
	/**
	 * Security that is a sub-set of an investment fund, and is governed by the
	 * same investment fund policy, eg, dividend option or valuation currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
	 * InvestmentFund.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmInvestmentFundClass;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "FndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetails";
			definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
		}
	};
	protected ValuationDealingProcessingCharacteristics2 valuationDealingCharacteristics;
	/**
	 * Processing characteristics linked to the instrument, ie, not to the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
	 * InvestmentFundClass.mmProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDealgChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDealingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the instrument, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValuationDealingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "ValtnDealgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDealingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2.mmObject();
		}
	};
	protected InvestmentRestrictions2 investmentRestrictions;
	/**
	 * Processing characteristics linked to the instrument, ie, not to the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
	 * InvestmentFund.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the instrument, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentRestrictions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmInvestmentFundClass;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentRestrictions";
			definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions2.mmObject();
		}
	};
	protected ProcessingCharacteristics2 subscriptionProcessingCharacteristics;
	/**
	 * Processing characteristics linked to the instrument, ie, not to the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2
	 * ProcessingCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
	 * InvestmentFundClass.mmProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPrcgChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the instrument, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionProcessingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "SbcptPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics2.mmObject();
		}
	};
	protected ProcessingCharacteristics3 redemptionProcessingCharacteristics;
	/**
	 * Processing characteristics linked to the instrument, ie, not to the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3
	 * ProcessingCharacteristics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
	 * InvestmentFundClass.mmProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPrcgChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics linked to the instrument, ie, not to  the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionProcessingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "RedPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashAccount22> settlementDetails;
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount22
	 * CashAccount22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementAccount;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Account to or from which a cash entry is made.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount22.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LocalMarketAnnex2> localMarketAnnex;
	/**
	 * Context, or geographic environment, in which trading parties may meet in
	 * order to negotiate and execute trades among themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
	 * LocalMarketAnnex2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclMktAnx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarketAnnex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalMarketAnnex = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "LclMktAnx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketAnnex";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LocalMarketAnnex2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FundProcessingPassport1.mmUpdatedDate, FundProcessingPassport1.mmSecurityIdentification, FundProcessingPassport1.mmMainFundOrderDesk,
						FundProcessingPassport1.mmFundManagementCompany, FundProcessingPassport1.mmFundDetails, FundProcessingPassport1.mmValuationDealingCharacteristics, FundProcessingPassport1.mmInvestmentRestrictions,
						FundProcessingPassport1.mmSubscriptionProcessingCharacteristics, FundProcessingPassport1.mmRedemptionProcessingCharacteristics, FundProcessingPassport1.mmSettlementDetails,
						FundProcessingPassport1.mmLocalMarketAnnex, FundProcessingPassport1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmFundProcessingPassport);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundProcessingPassport1";
				definition = "Fund Processing Passsport (FPP) is a fully harmonised document with all key operational information that fund promoters should provide on their investment funds in order to facilitate their trading.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UpdtdDt", required = true)
	public UpdatedDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(com.tools20022.repository.msg.UpdatedDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	@XmlElement(name = "SctyId", required = true)
	public SecurityIdentification1 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification1 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	@XmlElement(name = "MainFndOrdrDsk", required = true)
	public ContactAttributes1 getMainFundOrderDesk() {
		return mainFundOrderDesk;
	}

	public void setMainFundOrderDesk(com.tools20022.repository.msg.ContactAttributes1 mainFundOrderDesk) {
		this.mainFundOrderDesk = mainFundOrderDesk;
	}

	@XmlElement(name = "FndMgmtCpny", required = true)
	public ContactAttributes1 getFundManagementCompany() {
		return fundManagementCompany;
	}

	public void setFundManagementCompany(com.tools20022.repository.msg.ContactAttributes1 fundManagementCompany) {
		this.fundManagementCompany = fundManagementCompany;
	}

	@XmlElement(name = "FndDtls", required = true)
	public FinancialInstrument20 getFundDetails() {
		return fundDetails;
	}

	public void setFundDetails(com.tools20022.repository.msg.FinancialInstrument20 fundDetails) {
		this.fundDetails = fundDetails;
	}

	@XmlElement(name = "ValtnDealgChrtcs", required = true)
	public ValuationDealingProcessingCharacteristics2 getValuationDealingCharacteristics() {
		return valuationDealingCharacteristics;
	}

	public void setValuationDealingCharacteristics(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2 valuationDealingCharacteristics) {
		this.valuationDealingCharacteristics = valuationDealingCharacteristics;
	}

	@XmlElement(name = "InvstmtRstrctns", required = true)
	public InvestmentRestrictions2 getInvestmentRestrictions() {
		return investmentRestrictions;
	}

	public void setInvestmentRestrictions(com.tools20022.repository.msg.InvestmentRestrictions2 investmentRestrictions) {
		this.investmentRestrictions = investmentRestrictions;
	}

	@XmlElement(name = "SbcptPrcgChrtcs", required = true)
	public ProcessingCharacteristics2 getSubscriptionProcessingCharacteristics() {
		return subscriptionProcessingCharacteristics;
	}

	public void setSubscriptionProcessingCharacteristics(com.tools20022.repository.msg.ProcessingCharacteristics2 subscriptionProcessingCharacteristics) {
		this.subscriptionProcessingCharacteristics = subscriptionProcessingCharacteristics;
	}

	@XmlElement(name = "RedPrcgChrtcs", required = true)
	public ProcessingCharacteristics3 getRedemptionProcessingCharacteristics() {
		return redemptionProcessingCharacteristics;
	}

	public void setRedemptionProcessingCharacteristics(com.tools20022.repository.msg.ProcessingCharacteristics3 redemptionProcessingCharacteristics) {
		this.redemptionProcessingCharacteristics = redemptionProcessingCharacteristics;
	}

	@XmlElement(name = "SttlmDtls", required = true)
	public List<CashAccount22> getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(List<com.tools20022.repository.msg.CashAccount22> settlementDetails) {
		this.settlementDetails = settlementDetails;
	}

	@XmlElement(name = "LclMktAnx")
	public List<LocalMarketAnnex2> getLocalMarketAnnex() {
		return localMarketAnnex;
	}

	public void setLocalMarketAnnex(List<com.tools20022.repository.msg.LocalMarketAnnex2> localMarketAnnex) {
		this.localMarketAnnex = localMarketAnnex;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = extension;
	}
}