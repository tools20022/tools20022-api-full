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
import com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03;
import com.tools20022.repository.area.tsmt.BaselineReSubmissionV03;
import com.tools20022.repository.area.tsmt.FullPushThroughReportV03;
import com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03;
import com.tools20022.repository.codeset.TradeFinanceService2Code;
import com.tools20022.repository.datatype.ISODate;
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
 * Specifies the commercial details of the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmSubmitterBaselineIdentification
 * Baseline3.mmSubmitterBaselineIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmServiceCode
 * Baseline3.mmServiceCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmPurchaseOrderReference
 * Baseline3.mmPurchaseOrderReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmBuyer
 * Baseline3.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmSeller
 * Baseline3.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmBuyerBank
 * Baseline3.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmSellerBank
 * Baseline3.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmBuyerSideSubmittingBank
 * Baseline3.mmBuyerSideSubmittingBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmSellerSideSubmittingBank
 * Baseline3.mmSellerSideSubmittingBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmBillTo
 * Baseline3.mmBillTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmShipTo
 * Baseline3.mmShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmConsignee
 * Baseline3.mmConsignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmGoods
 * Baseline3.mmGoods}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmPaymentTerms
 * Baseline3.mmPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmSettlementTerms
 * Baseline3.mmSettlementTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmPaymentObligation
 * Baseline3.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmLatestMatchDate
 * Baseline3.mmLatestMatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmCommercialDataSetRequired
 * Baseline3.mmCommercialDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmTransportDataSetRequired
 * Baseline3.mmTransportDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmInsuranceDataSetRequired
 * Baseline3.mmInsuranceDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmCertificateDataSetRequired
 * Baseline3.mmCertificateDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmOtherCertificateDataSetRequired
 * Baseline3.mmOtherCertificateDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline3#mmIntentToPayExpected
 * Baseline3.mmIntentToPayExpected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmBaseline
 * BaselineAmendmentRequestV03.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBaseline
 * BaselineReSubmissionV03.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmPushedThroughBaseline
 * FullPushThroughReportV03.mmPushedThroughBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmBaseline
 * InitialBaselineSubmissionV03.mmBaseline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransShipmentRule#forBaseline3
 * ConstraintTransShipmentRule.forBaseline3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Baseline3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the commercial details of the underlying transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4 Baseline4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Baseline3", propOrder = {"submitterBaselineIdentification", "serviceCode", "purchaseOrderReference", "buyer", "seller", "buyerBank", "sellerBank", "buyerSideSubmittingBank", "sellerSideSubmittingBank", "billTo", "shipTo",
		"consignee", "goods", "paymentTerms", "settlementTerms", "paymentObligation", "latestMatchDate", "commercialDataSetRequired", "transportDataSetRequired", "insuranceDataSetRequired", "certificateDataSetRequired",
		"otherCertificateDataSetRequired", "intentToPayExpected"})
public class Baseline3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubmitrBaselnId", required = true)
	protected DocumentIdentification1 submitterBaselineIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the baseline provided by the submitter."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSubmitterBaselineIdentification
	 * Baseline4.mmSubmitterBaselineIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmitterBaselineIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "SubmitrBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterBaselineIdentification";
			definition = "Identifies the baseline provided by the submitter.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmSubmitterBaselineIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification1.mmObject();
		}
	};
	@XmlElement(name = "SvcCd", required = true)
	protected TradeFinanceService2Code serviceCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceService2Code
	 * TradeFinanceService2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the service requested by the submitter by means of a code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmServiceCode
	 * Baseline4.mmServiceCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "SvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCode";
			definition = "Identifies the service requested by the submitter by means of a code.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmServiceCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeFinanceService2Code.mmObject();
		}
	};
	@XmlElement(name = "PurchsOrdrRef", required = true)
	protected DocumentIdentification7 purchaseOrderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsOrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the purchase order of the underlying transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPurchaseOrderReference
	 * Baseline4.mmPurchaseOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseOrderReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmPurchaseOrderReference);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification26 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmBuyer
	 * Baseline4.mmBuyer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmBuyer);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification26 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmSeller
	 * Baseline4.mmSeller}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSeller = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmSeller);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	@XmlElement(name = "BuyrBk", required = true)
	protected BICIdentification1 buyerBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of the buyer, uniquely identified by its BIC."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmBuyerBank
	 * Baseline4.mmBuyerBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "Financial institution of the buyer, uniquely identified by its BIC.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmBuyerBank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	@XmlElement(name = "SellrBk", required = true)
	protected BICIdentification1 sellerBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of the seller, uniquely identified by its BIC."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmSellerBank
	 * Baseline4.mmSellerBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "Financial institution of the seller, uniquely identified by its BIC.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmSellerBank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	@XmlElement(name = "BuyrSdSubmitgBk")
	protected List<com.tools20022.repository.msg.BICIdentification1> buyerSideSubmittingBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrSdSubmitgBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerSideSubmittingBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution on the buyer's side, uniquely identified by its BIC. As part of the transaction, it may submit data sets."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmBuyerSideSubmittingBank
	 * Baseline4.mmBuyerSideSubmittingBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerSideSubmittingBank = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "BuyrSdSubmitgBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerSideSubmittingBank";
			definition = "Financial institution on the buyer's side, uniquely identified by its BIC. As part of the transaction, it may submit data sets.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmBuyerSideSubmittingBank);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	@XmlElement(name = "SellrSdSubmitgBk")
	protected List<com.tools20022.repository.msg.BICIdentification1> sellerSideSubmittingBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrSdSubmitgBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSideSubmittingBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution on the seller's side, uniquely identified by its BIC. As part of the transaction, it may submit data sets."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSellerSideSubmittingBank
	 * Baseline4.mmSellerSideSubmittingBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerSideSubmittingBank = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "SellrSdSubmitgBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSideSubmittingBank";
			definition = "Financial institution on the seller's side, uniquely identified by its BIC. As part of the transaction, it may submit data sets.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmSellerSideSubmittingBank);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	@XmlElement(name = "BllTo")
	protected PartyIdentification26 billTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to be invoiced for the purchase."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmBillTo
	 * Baseline4.mmBillTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "BllTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillTo";
			definition = "Party to be invoiced for the purchase.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmBillTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	@XmlElement(name = "ShipTo")
	protected PartyIdentification26 shipTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered in the end."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmShipTo
	 * Baseline4.mmShipTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods must be delivered in the end.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmShipTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	@XmlElement(name = "Consgn")
	protected PartyIdentification26 consignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmConsignee
	 * Baseline4.mmConsignee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to whom the goods must be delivered.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmConsignee);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	@XmlElement(name = "Goods", required = true)
	protected LineItem7 goods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItem7 LineItem7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Goods or services that are part of a commercial trade agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmGoods
	 * Baseline4.mmGoods}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGoods = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CommercialTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "Goods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Goods";
			definition = "Goods or services that are part of a commercial trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmGoods);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItem7.mmObject();
		}
	};
	@XmlElement(name = "PmtTerms", required = true)
	protected List<com.tools20022.repository.msg.PaymentTerms1> paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms1
	 * PaymentTerms1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment terms by means of a code and a limit in time."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmPaymentTerms
	 * Baseline4.mmPaymentTerms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPaymentObligation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms by means of a code and a limit in time.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmPaymentTerms);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
		}
	};
	@XmlElement(name = "SttlmTerms")
	protected SettlementTerms2 settlementTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms2
	 * SettlementTerms2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the underlying transaction should be settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSettlementTerms
	 * Baseline4.mmSettlementTerms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Specifies how the underlying transaction should be settled.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmSettlementTerms);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTerms2.mmObject();
		}
	};
	@XmlElement(name = "PmtOblgtn")
	protected List<com.tools20022.repository.msg.PaymentObligation1> paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentObligation1
	 * PaymentObligation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtOblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details of the payment obligation between financial institutions in this transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPaymentObligation
	 * Baseline4.mmPaymentObligation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentObligation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPaymentObligation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "PmtOblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the details of the payment obligation between financial institutions in this transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmPaymentObligation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentObligation1.mmObject();
		}
	};
	@XmlElement(name = "LatstMtchDt")
	protected ISODate latestMatchDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstMtchDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestMatchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the latest date on which a data set must be matched with a baseline."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmLatestMatchDate
	 * Baseline4.mmLatestMatchDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLatestMatchDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "LatstMtchDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestMatchDate";
			definition = "Specifies the latest date on which a data set must be matched with a baseline.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmLatestMatchDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "ComrclDataSetReqrd", required = true)
	protected RequiredSubmission2 commercialDataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission2
	 * RequiredSubmission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclDataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a commercial data set is required for each shipment part of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmCommercialDataSetRequired
	 * Baseline4.mmCommercialDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommercialDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "ComrclDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSetRequired";
			definition = "Specifies that a commercial data set is required for each shipment part of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmCommercialDataSetRequired);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission2.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtDataSetReqrd")
	protected RequiredSubmission2 transportDataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission2
	 * RequiredSubmission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtDataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a transport data set is required for each shipment part of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmTransportDataSetRequired
	 * Baseline4.mmTransportDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSetRequired";
			definition = "Specifies that a transport data set is required for each shipment part of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmTransportDataSetRequired);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission2.mmObject();
		}
	};
	@XmlElement(name = "InsrncDataSetReqrd")
	protected RequiredSubmission3 insuranceDataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncDataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceDataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that an insurance data set is required for each shipment part of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmInsuranceDataSetRequired
	 * Baseline4.mmInsuranceDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInsuranceDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "InsrncDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSetRequired";
			definition = "Specifies that an insurance data set is required for each shipment part of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmInsuranceDataSetRequired);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
		}
	};
	@XmlElement(name = "CertDataSetReqrd")
	protected List<com.tools20022.repository.msg.RequiredSubmission4> certificateDataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertDataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a certificate data set is required for each shipment part of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmCertificateDataSetRequired
	 * Baseline4.mmCertificateDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificateDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "CertDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSetRequired";
			definition = "Specifies that a certificate data set is required for each shipment part of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmCertificateDataSetRequired);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
		}
	};
	@XmlElement(name = "OthrCertDataSetReqrd")
	protected List<com.tools20022.repository.msg.RequiredSubmission5> otherCertificateDataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission5
	 * RequiredSubmission5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCertDataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCertificateDataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that another type of certificate data set is required for each shipment part of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmOtherCertificateDataSetRequired
	 * Baseline4.mmOtherCertificateDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCertificateDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "OthrCertDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSetRequired";
			definition = "Specifies that another type of certificate data set is required for each shipment part of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmOtherCertificateDataSetRequired);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission5.mmObject();
		}
	};
	@XmlElement(name = "InttToPayXpctd", required = true)
	protected YesNoIndicator intentToPayExpected;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InttToPayXpctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntentToPayExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that IntentToPayNotice message(s) are expected as part of this transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmIntentToPayExpected
	 * Baseline4.mmIntentToPayExpected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntentToPayExpected = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Baseline3.mmObject();
			isDerived = false;
			xmlTag = "InttToPayXpctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntentToPayExpected";
			definition = "Specifies that IntentToPayNotice message(s) are expected as part of this transaction.";
			nextVersions_lazy = () -> Arrays.asList(Baseline4.mmIntentToPayExpected);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Baseline3.mmSubmitterBaselineIdentification, com.tools20022.repository.msg.Baseline3.mmServiceCode,
						com.tools20022.repository.msg.Baseline3.mmPurchaseOrderReference, com.tools20022.repository.msg.Baseline3.mmBuyer, com.tools20022.repository.msg.Baseline3.mmSeller,
						com.tools20022.repository.msg.Baseline3.mmBuyerBank, com.tools20022.repository.msg.Baseline3.mmSellerBank, com.tools20022.repository.msg.Baseline3.mmBuyerSideSubmittingBank,
						com.tools20022.repository.msg.Baseline3.mmSellerSideSubmittingBank, com.tools20022.repository.msg.Baseline3.mmBillTo, com.tools20022.repository.msg.Baseline3.mmShipTo,
						com.tools20022.repository.msg.Baseline3.mmConsignee, com.tools20022.repository.msg.Baseline3.mmGoods, com.tools20022.repository.msg.Baseline3.mmPaymentTerms,
						com.tools20022.repository.msg.Baseline3.mmSettlementTerms, com.tools20022.repository.msg.Baseline3.mmPaymentObligation, com.tools20022.repository.msg.Baseline3.mmLatestMatchDate,
						com.tools20022.repository.msg.Baseline3.mmCommercialDataSetRequired, com.tools20022.repository.msg.Baseline3.mmTransportDataSetRequired, com.tools20022.repository.msg.Baseline3.mmInsuranceDataSetRequired,
						com.tools20022.repository.msg.Baseline3.mmCertificateDataSetRequired, com.tools20022.repository.msg.Baseline3.mmOtherCertificateDataSetRequired, com.tools20022.repository.msg.Baseline3.mmIntentToPayExpected);
				messageBuildingBlock_lazy = () -> Arrays.asList(BaselineAmendmentRequestV03.mmBaseline, BaselineReSubmissionV03.mmBaseline, FullPushThroughReportV03.mmPushedThroughBaseline, InitialBaselineSubmissionV03.mmBaseline);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransShipmentRule.forBaseline3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Baseline3";
				definition = "Specifies the commercial details of the underlying transaction.";
				nextVersions_lazy = () -> Arrays.asList(Baseline4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1 getSubmitterBaselineIdentification() {
		return submitterBaselineIdentification;
	}

	public Baseline3 setSubmitterBaselineIdentification(com.tools20022.repository.msg.DocumentIdentification1 submitterBaselineIdentification) {
		this.submitterBaselineIdentification = Objects.requireNonNull(submitterBaselineIdentification);
		return this;
	}

	public TradeFinanceService2Code getServiceCode() {
		return serviceCode;
	}

	public Baseline3 setServiceCode(TradeFinanceService2Code serviceCode) {
		this.serviceCode = Objects.requireNonNull(serviceCode);
		return this;
	}

	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public Baseline3 setPurchaseOrderReference(com.tools20022.repository.msg.DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = Objects.requireNonNull(purchaseOrderReference);
		return this;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public Baseline3 setBuyer(com.tools20022.repository.msg.PartyIdentification26 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public Baseline3 setSeller(com.tools20022.repository.msg.PartyIdentification26 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public Baseline3 setBuyerBank(com.tools20022.repository.msg.BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public Baseline3 setSellerBank(com.tools20022.repository.msg.BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public List<BICIdentification1> getBuyerSideSubmittingBank() {
		return buyerSideSubmittingBank == null ? buyerSideSubmittingBank = new ArrayList<>() : buyerSideSubmittingBank;
	}

	public Baseline3 setBuyerSideSubmittingBank(List<com.tools20022.repository.msg.BICIdentification1> buyerSideSubmittingBank) {
		this.buyerSideSubmittingBank = Objects.requireNonNull(buyerSideSubmittingBank);
		return this;
	}

	public List<BICIdentification1> getSellerSideSubmittingBank() {
		return sellerSideSubmittingBank == null ? sellerSideSubmittingBank = new ArrayList<>() : sellerSideSubmittingBank;
	}

	public Baseline3 setSellerSideSubmittingBank(List<com.tools20022.repository.msg.BICIdentification1> sellerSideSubmittingBank) {
		this.sellerSideSubmittingBank = Objects.requireNonNull(sellerSideSubmittingBank);
		return this;
	}

	public Optional<PartyIdentification26> getBillTo() {
		return billTo == null ? Optional.empty() : Optional.of(billTo);
	}

	public Baseline3 setBillTo(com.tools20022.repository.msg.PartyIdentification26 billTo) {
		this.billTo = billTo;
		return this;
	}

	public Optional<PartyIdentification26> getShipTo() {
		return shipTo == null ? Optional.empty() : Optional.of(shipTo);
	}

	public Baseline3 setShipTo(com.tools20022.repository.msg.PartyIdentification26 shipTo) {
		this.shipTo = shipTo;
		return this;
	}

	public Optional<PartyIdentification26> getConsignee() {
		return consignee == null ? Optional.empty() : Optional.of(consignee);
	}

	public Baseline3 setConsignee(com.tools20022.repository.msg.PartyIdentification26 consignee) {
		this.consignee = consignee;
		return this;
	}

	public LineItem7 getGoods() {
		return goods;
	}

	public Baseline3 setGoods(com.tools20022.repository.msg.LineItem7 goods) {
		this.goods = Objects.requireNonNull(goods);
		return this;
	}

	public List<PaymentTerms1> getPaymentTerms() {
		return paymentTerms == null ? paymentTerms = new ArrayList<>() : paymentTerms;
	}

	public Baseline3 setPaymentTerms(List<com.tools20022.repository.msg.PaymentTerms1> paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public Optional<SettlementTerms2> getSettlementTerms() {
		return settlementTerms == null ? Optional.empty() : Optional.of(settlementTerms);
	}

	public Baseline3 setSettlementTerms(com.tools20022.repository.msg.SettlementTerms2 settlementTerms) {
		this.settlementTerms = settlementTerms;
		return this;
	}

	public List<PaymentObligation1> getPaymentObligation() {
		return paymentObligation == null ? paymentObligation = new ArrayList<>() : paymentObligation;
	}

	public Baseline3 setPaymentObligation(List<com.tools20022.repository.msg.PaymentObligation1> paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public Optional<ISODate> getLatestMatchDate() {
		return latestMatchDate == null ? Optional.empty() : Optional.of(latestMatchDate);
	}

	public Baseline3 setLatestMatchDate(ISODate latestMatchDate) {
		this.latestMatchDate = latestMatchDate;
		return this;
	}

	public RequiredSubmission2 getCommercialDataSetRequired() {
		return commercialDataSetRequired;
	}

	public Baseline3 setCommercialDataSetRequired(com.tools20022.repository.msg.RequiredSubmission2 commercialDataSetRequired) {
		this.commercialDataSetRequired = Objects.requireNonNull(commercialDataSetRequired);
		return this;
	}

	public Optional<RequiredSubmission2> getTransportDataSetRequired() {
		return transportDataSetRequired == null ? Optional.empty() : Optional.of(transportDataSetRequired);
	}

	public Baseline3 setTransportDataSetRequired(com.tools20022.repository.msg.RequiredSubmission2 transportDataSetRequired) {
		this.transportDataSetRequired = transportDataSetRequired;
		return this;
	}

	public Optional<RequiredSubmission3> getInsuranceDataSetRequired() {
		return insuranceDataSetRequired == null ? Optional.empty() : Optional.of(insuranceDataSetRequired);
	}

	public Baseline3 setInsuranceDataSetRequired(com.tools20022.repository.msg.RequiredSubmission3 insuranceDataSetRequired) {
		this.insuranceDataSetRequired = insuranceDataSetRequired;
		return this;
	}

	public List<RequiredSubmission4> getCertificateDataSetRequired() {
		return certificateDataSetRequired == null ? certificateDataSetRequired = new ArrayList<>() : certificateDataSetRequired;
	}

	public Baseline3 setCertificateDataSetRequired(List<com.tools20022.repository.msg.RequiredSubmission4> certificateDataSetRequired) {
		this.certificateDataSetRequired = Objects.requireNonNull(certificateDataSetRequired);
		return this;
	}

	public List<RequiredSubmission5> getOtherCertificateDataSetRequired() {
		return otherCertificateDataSetRequired == null ? otherCertificateDataSetRequired = new ArrayList<>() : otherCertificateDataSetRequired;
	}

	public Baseline3 setOtherCertificateDataSetRequired(List<com.tools20022.repository.msg.RequiredSubmission5> otherCertificateDataSetRequired) {
		this.otherCertificateDataSetRequired = Objects.requireNonNull(otherCertificateDataSetRequired);
		return this;
	}

	public YesNoIndicator getIntentToPayExpected() {
		return intentToPayExpected;
	}

	public Baseline3 setIntentToPayExpected(YesNoIndicator intentToPayExpected) {
		this.intentToPayExpected = Objects.requireNonNull(intentToPayExpected);
		return this;
	}
}