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
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundProcessingPassport1", propOrder = {"updatedDate", "securityIdentification", "mainFundOrderDesk", "fundManagementCompany", "fundDetails", "valuationDealingCharacteristics", "investmentRestrictions",
		"subscriptionProcessingCharacteristics", "redemptionProcessingCharacteristics", "settlementDetails", "localMarketAnnex", "extension"})
public class FundProcessingPassport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UpdtdDt", required = true)
	protected UpdatedDate updatedDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, UpdatedDate> mmUpdatedDate = new MMMessageAssociationEnd<FundProcessingPassport1, UpdatedDate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "UpdtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdatedDate";
			definition = "Date of last revision.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UpdatedDate.mmObject();
		}

		@Override
		public UpdatedDate getValue(FundProcessingPassport1 obj) {
			return obj.getUpdatedDate();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, UpdatedDate value) {
			obj.setUpdatedDate(value);
		}
	};
	@XmlElement(name = "SctyId", required = true)
	protected SecurityIdentification1 securityIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, SecurityIdentification1> mmSecurityIdentification = new MMMessageAssociationEnd<FundProcessingPassport1, SecurityIdentification1>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification1.mmObject();
		}

		@Override
		public SecurityIdentification1 getValue(FundProcessingPassport1 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, SecurityIdentification1 value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "MainFndOrdrDsk", required = true)
	protected ContactAttributes1 mainFundOrderDesk;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, ContactAttributes1> mmMainFundOrderDesk = new MMMessageAssociationEnd<FundProcessingPassport1, ContactAttributes1>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmOrderDesk;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "MainFndOrdrDsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainFundOrderDesk";
			definition = "Principal entity appointed by the fund, to which orders should be submitted. Usually located in the country of domicile.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContactAttributes1.mmObject();
		}

		@Override
		public ContactAttributes1 getValue(FundProcessingPassport1 obj) {
			return obj.getMainFundOrderDesk();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, ContactAttributes1 value) {
			obj.setMainFundOrderDesk(value);
		}
	};
	@XmlElement(name = "FndMgmtCpny", required = true)
	protected ContactAttributes1 fundManagementCompany;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, ContactAttributes1> mmFundManagementCompany = new MMMessageAssociationEnd<FundProcessingPassport1, ContactAttributes1>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "FndMgmtCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			definition = "Company that is responsible for the management and operation of the fund, eg, determines the investment strategy, appoints\r\nthe service providers, and makes major decisions for the fund. It is usually responsible for the distribution and marketing\r\nof the fund. For self-managed funds, this wlll often be a separate promoter or sponsor of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContactAttributes1.mmObject();
		}

		@Override
		public ContactAttributes1 getValue(FundProcessingPassport1 obj) {
			return obj.getFundManagementCompany();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, ContactAttributes1 value) {
			obj.setFundManagementCompany(value);
		}
	};
	@XmlElement(name = "FndDtls", required = true)
	protected FinancialInstrument20 fundDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, FinancialInstrument20> mmFundDetails = new MMMessageAssociationEnd<FundProcessingPassport1, FinancialInstrument20>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "FndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetails";
			definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument20.mmObject();
		}

		@Override
		public FinancialInstrument20 getValue(FundProcessingPassport1 obj) {
			return obj.getFundDetails();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, FinancialInstrument20 value) {
			obj.setFundDetails(value);
		}
	};
	@XmlElement(name = "ValtnDealgChrtcs", required = true)
	protected ValuationDealingProcessingCharacteristics2 valuationDealingCharacteristics;
	/**
	 * 
	 <p>
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
	 * "Processing characteristics linked to the instrument, ie, not to the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundProcessingPassport1, ValuationDealingProcessingCharacteristics2> mmValuationDealingCharacteristics = new MMMessageAssociationEnd<FundProcessingPassport1, ValuationDealingProcessingCharacteristics2>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "ValtnDealgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDealingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
		}

		@Override
		public ValuationDealingProcessingCharacteristics2 getValue(FundProcessingPassport1 obj) {
			return obj.getValuationDealingCharacteristics();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, ValuationDealingProcessingCharacteristics2 value) {
			obj.setValuationDealingCharacteristics(value);
		}
	};
	@XmlElement(name = "InvstmtRstrctns", required = true)
	protected InvestmentRestrictions2 investmentRestrictions;
	/**
	 * 
	 <p>
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
	 * "Processing characteristics linked to the instrument, ie, not to the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundProcessingPassport1, InvestmentRestrictions2> mmInvestmentRestrictions = new MMMessageAssociationEnd<FundProcessingPassport1, InvestmentRestrictions2>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentRestrictions";
			definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentRestrictions2.mmObject();
		}

		@Override
		public InvestmentRestrictions2 getValue(FundProcessingPassport1 obj) {
			return obj.getInvestmentRestrictions();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, InvestmentRestrictions2 value) {
			obj.setInvestmentRestrictions(value);
		}
	};
	@XmlElement(name = "SbcptPrcgChrtcs", required = true)
	protected ProcessingCharacteristics2 subscriptionProcessingCharacteristics;
	/**
	 * 
	 <p>
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
	 * "Processing characteristics linked to the instrument, ie, not to the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundProcessingPassport1, ProcessingCharacteristics2> mmSubscriptionProcessingCharacteristics = new MMMessageAssociationEnd<FundProcessingPassport1, ProcessingCharacteristics2>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "SbcptPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProcessingCharacteristics2.mmObject();
		}

		@Override
		public ProcessingCharacteristics2 getValue(FundProcessingPassport1 obj) {
			return obj.getSubscriptionProcessingCharacteristics();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, ProcessingCharacteristics2 value) {
			obj.setSubscriptionProcessingCharacteristics(value);
		}
	};
	@XmlElement(name = "RedPrcgChrtcs", required = true)
	protected ProcessingCharacteristics3 redemptionProcessingCharacteristics;
	/**
	 * 
	 <p>
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
	 * "Processing characteristics linked to the instrument, ie, not to the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundProcessingPassport1, ProcessingCharacteristics3> mmRedemptionProcessingCharacteristics = new MMMessageAssociationEnd<FundProcessingPassport1, ProcessingCharacteristics3>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProcessingCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "RedPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionProcessingCharacteristics";
			definition = "Processing characteristics linked to the instrument, ie, not to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProcessingCharacteristics3.mmObject();
		}

		@Override
		public ProcessingCharacteristics3 getValue(FundProcessingPassport1 obj) {
			return obj.getRedemptionProcessingCharacteristics();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, ProcessingCharacteristics3 value) {
			obj.setRedemptionProcessingCharacteristics(value);
		}
	};
	@XmlElement(name = "SttlmDtls", required = true)
	protected List<CashAccount22> settlementDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, List<CashAccount22>> mmSettlementDetails = new MMMessageAssociationEnd<FundProcessingPassport1, List<CashAccount22>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Account to or from which a cash entry is made.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount22.mmObject();
		}

		@Override
		public List<CashAccount22> getValue(FundProcessingPassport1 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, List<CashAccount22> value) {
			obj.setSettlementDetails(value);
		}
	};
	@XmlElement(name = "LclMktAnx")
	protected List<LocalMarketAnnex2> localMarketAnnex;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, List<LocalMarketAnnex2>> mmLocalMarketAnnex = new MMMessageAssociationEnd<FundProcessingPassport1, List<LocalMarketAnnex2>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "LclMktAnx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketAnnex";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalMarketAnnex2.mmObject();
		}

		@Override
		public List<LocalMarketAnnex2> getValue(FundProcessingPassport1 obj) {
			return obj.getLocalMarketAnnex();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, List<LocalMarketAnnex2> value) {
			obj.setLocalMarketAnnex(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<FundProcessingPassport1, List<Extension1>> mmExtension = new MMMessageAssociationEnd<FundProcessingPassport1, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundProcessingPassport1.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(FundProcessingPassport1 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(FundProcessingPassport1 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundProcessingPassport1.mmUpdatedDate, com.tools20022.repository.msg.FundProcessingPassport1.mmSecurityIdentification,
						com.tools20022.repository.msg.FundProcessingPassport1.mmMainFundOrderDesk, com.tools20022.repository.msg.FundProcessingPassport1.mmFundManagementCompany,
						com.tools20022.repository.msg.FundProcessingPassport1.mmFundDetails, com.tools20022.repository.msg.FundProcessingPassport1.mmValuationDealingCharacteristics,
						com.tools20022.repository.msg.FundProcessingPassport1.mmInvestmentRestrictions, com.tools20022.repository.msg.FundProcessingPassport1.mmSubscriptionProcessingCharacteristics,
						com.tools20022.repository.msg.FundProcessingPassport1.mmRedemptionProcessingCharacteristics, com.tools20022.repository.msg.FundProcessingPassport1.mmSettlementDetails,
						com.tools20022.repository.msg.FundProcessingPassport1.mmLocalMarketAnnex, com.tools20022.repository.msg.FundProcessingPassport1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmFundProcessingPassport);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundProcessingPassport1";
				definition = "Fund Processing Passsport (FPP) is a fully harmonised document with all key operational information that fund promoters should provide on their investment funds in order to facilitate their trading.";
			}
		});
		return mmObject_lazy.get();
	}

	public UpdatedDate getUpdatedDate() {
		return updatedDate;
	}

	public FundProcessingPassport1 setUpdatedDate(UpdatedDate updatedDate) {
		this.updatedDate = Objects.requireNonNull(updatedDate);
		return this;
	}

	public SecurityIdentification1 getSecurityIdentification() {
		return securityIdentification;
	}

	public FundProcessingPassport1 setSecurityIdentification(SecurityIdentification1 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public ContactAttributes1 getMainFundOrderDesk() {
		return mainFundOrderDesk;
	}

	public FundProcessingPassport1 setMainFundOrderDesk(ContactAttributes1 mainFundOrderDesk) {
		this.mainFundOrderDesk = Objects.requireNonNull(mainFundOrderDesk);
		return this;
	}

	public ContactAttributes1 getFundManagementCompany() {
		return fundManagementCompany;
	}

	public FundProcessingPassport1 setFundManagementCompany(ContactAttributes1 fundManagementCompany) {
		this.fundManagementCompany = Objects.requireNonNull(fundManagementCompany);
		return this;
	}

	public FinancialInstrument20 getFundDetails() {
		return fundDetails;
	}

	public FundProcessingPassport1 setFundDetails(FinancialInstrument20 fundDetails) {
		this.fundDetails = Objects.requireNonNull(fundDetails);
		return this;
	}

	public ValuationDealingProcessingCharacteristics2 getValuationDealingCharacteristics() {
		return valuationDealingCharacteristics;
	}

	public FundProcessingPassport1 setValuationDealingCharacteristics(ValuationDealingProcessingCharacteristics2 valuationDealingCharacteristics) {
		this.valuationDealingCharacteristics = Objects.requireNonNull(valuationDealingCharacteristics);
		return this;
	}

	public InvestmentRestrictions2 getInvestmentRestrictions() {
		return investmentRestrictions;
	}

	public FundProcessingPassport1 setInvestmentRestrictions(InvestmentRestrictions2 investmentRestrictions) {
		this.investmentRestrictions = Objects.requireNonNull(investmentRestrictions);
		return this;
	}

	public ProcessingCharacteristics2 getSubscriptionProcessingCharacteristics() {
		return subscriptionProcessingCharacteristics;
	}

	public FundProcessingPassport1 setSubscriptionProcessingCharacteristics(ProcessingCharacteristics2 subscriptionProcessingCharacteristics) {
		this.subscriptionProcessingCharacteristics = Objects.requireNonNull(subscriptionProcessingCharacteristics);
		return this;
	}

	public ProcessingCharacteristics3 getRedemptionProcessingCharacteristics() {
		return redemptionProcessingCharacteristics;
	}

	public FundProcessingPassport1 setRedemptionProcessingCharacteristics(ProcessingCharacteristics3 redemptionProcessingCharacteristics) {
		this.redemptionProcessingCharacteristics = Objects.requireNonNull(redemptionProcessingCharacteristics);
		return this;
	}

	public List<CashAccount22> getSettlementDetails() {
		return settlementDetails == null ? settlementDetails = new ArrayList<>() : settlementDetails;
	}

	public FundProcessingPassport1 setSettlementDetails(List<CashAccount22> settlementDetails) {
		this.settlementDetails = Objects.requireNonNull(settlementDetails);
		return this;
	}

	public List<LocalMarketAnnex2> getLocalMarketAnnex() {
		return localMarketAnnex == null ? localMarketAnnex = new ArrayList<>() : localMarketAnnex;
	}

	public FundProcessingPassport1 setLocalMarketAnnex(List<LocalMarketAnnex2> localMarketAnnex) {
		this.localMarketAnnex = Objects.requireNonNull(localMarketAnnex);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public FundProcessingPassport1 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}