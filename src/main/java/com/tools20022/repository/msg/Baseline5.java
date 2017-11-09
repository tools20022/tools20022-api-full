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
import com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05;
import com.tools20022.repository.area.tsmt.BaselineReSubmissionV05;
import com.tools20022.repository.area.tsmt.FullPushThroughReportV05;
import com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05;
import com.tools20022.repository.codeset.TradeFinanceService2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmSubmitterBaselineIdentification
 * Baseline5.mmSubmitterBaselineIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmServiceCode
 * Baseline5.mmServiceCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmPurchaseOrderReference
 * Baseline5.mmPurchaseOrderReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBuyer
 * Baseline5.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmSeller
 * Baseline5.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBuyerBank
 * Baseline5.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmSellerBank
 * Baseline5.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmBuyerSideSubmittingBank
 * Baseline5.mmBuyerSideSubmittingBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmSellerSideSubmittingBank
 * Baseline5.mmSellerSideSubmittingBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBillTo
 * Baseline5.mmBillTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmShipTo
 * Baseline5.mmShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmConsignee
 * Baseline5.mmConsignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmGoods
 * Baseline5.mmGoods}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmPaymentTerms
 * Baseline5.mmPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmSettlementTerms
 * Baseline5.mmSettlementTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmPaymentObligation
 * Baseline5.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmLatestMatchDate
 * Baseline5.mmLatestMatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmCommercialDataSetRequired
 * Baseline5.mmCommercialDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmTransportDataSetRequired
 * Baseline5.mmTransportDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmInsuranceDataSetRequired
 * Baseline5.mmInsuranceDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmCertificateDataSetRequired
 * Baseline5.mmCertificateDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmOtherCertificateDataSetRequired
 * Baseline5.mmOtherCertificateDataSetRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline5#mmIntentToPayExpected
 * Baseline5.mmIntentToPayExpected}</li>
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
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBaseline
 * InitialBaselineSubmissionV05.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBaseline
 * BaselineAmendmentRequestV05.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmPushedThroughBaseline
 * FullPushThroughReportV05.mmPushedThroughBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmBaseline
 * BaselineReSubmissionV05.mmBaseline}</li>
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
 * "Baseline5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the commercial details of the underlying transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Baseline4
 * Baseline4}</li>
 * </ul>
 */
public class Baseline5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification1 submitterBaselineIdentification;
	/**
	 * Identifies the baseline provided by the submitter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSubmitterBaselineIdentification
	 * Baseline4.mmSubmitterBaselineIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmitterBaselineIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "SubmitrBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterBaselineIdentification";
			definition = "Identifies the baseline provided by the submitter.";
			previousVersion_lazy = () -> Baseline4.mmSubmitterBaselineIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification1.mmObject();
		}
	};
	protected TradeFinanceService2Code serviceCode;
	/**
	 * Identifies the service requested by the submitter by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceService2Code
	 * TradeFinanceService2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmServiceCode
	 * Baseline4.mmServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "SvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCode";
			definition = "Identifies the service requested by the submitter by means of a code.";
			previousVersion_lazy = () -> Baseline4.mmServiceCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeFinanceService2Code.mmObject();
		}
	};
	protected DocumentIdentification7 purchaseOrderReference;
	/**
	 * Reference to the purchase order of the underlying transaction.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPurchaseOrderReference
	 * Baseline4.mmPurchaseOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseOrderReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmIdentification;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			previousVersion_lazy = () -> Baseline4.mmPurchaseOrderReference;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	protected PartyIdentification26 buyer;
	/**
	 * Party that buys goods or services, or a financial instrument.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmBuyer
	 * Baseline4.mmBuyer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			previousVersion_lazy = () -> Baseline4.mmBuyer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected PartyIdentification26 seller;
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSeller
	 * Baseline4.mmSeller}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSeller = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			previousVersion_lazy = () -> Baseline4.mmSeller;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected BICIdentification1 buyerBank;
	/**
	 * Financial institution of the buyer, uniquely identified by its BIC.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmBuyerBank
	 * Baseline4.mmBuyerBank}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "Financial institution of the buyer, uniquely identified by its BIC.";
			previousVersion_lazy = () -> Baseline4.mmBuyerBank;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected BICIdentification1 sellerBank;
	/**
	 * Financial institution of the seller, uniquely identified by its BIC.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSellerBank
	 * Baseline4.mmSellerBank}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "Financial institution of the seller, uniquely identified by its BIC.";
			previousVersion_lazy = () -> Baseline4.mmSellerBank;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BICIdentification1> buyerSideSubmittingBank;
	/**
	 * Financial institution on the buyer's side, uniquely identified by its
	 * BIC. As part of the transaction, it may submit data sets.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmBuyerSideSubmittingBank
	 * Baseline4.mmBuyerSideSubmittingBank}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerSideSubmittingBank = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "BuyrSdSubmitgBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerSideSubmittingBank";
			definition = "Financial institution on the buyer's side, uniquely identified by its BIC. As part of the transaction, it may submit data sets.";
			previousVersion_lazy = () -> Baseline4.mmBuyerSideSubmittingBank;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BICIdentification1> sellerSideSubmittingBank;
	/**
	 * Financial institution on the seller's side, uniquely identified by its
	 * BIC. As part of the transaction, it may submit data sets.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSellerSideSubmittingBank
	 * Baseline4.mmSellerSideSubmittingBank}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerSideSubmittingBank = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "SellrSdSubmitgBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSideSubmittingBank";
			definition = "Financial institution on the seller's side, uniquely identified by its BIC. As part of the transaction, it may submit data sets.";
			previousVersion_lazy = () -> Baseline4.mmSellerSideSubmittingBank;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected PartyIdentification26 billTo;
	/**
	 * Party to be invoiced for the purchase.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmBillTo
	 * Baseline4.mmBillTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "BllTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillTo";
			definition = "Party to be invoiced for the purchase.";
			previousVersion_lazy = () -> Baseline4.mmBillTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected PartyIdentification26 shipTo;
	/**
	 * Party to whom the goods must be delivered in the end.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmShipTo
	 * Baseline4.mmShipTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods must be delivered in the end.";
			previousVersion_lazy = () -> Baseline4.mmShipTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected PartyIdentification26 consignee;
	/**
	 * Party to whom the goods must be delivered.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmConsignee
	 * Baseline4.mmConsignee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to whom the goods must be delivered.";
			previousVersion_lazy = () -> Baseline4.mmConsignee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected LineItem13 goods;
	/**
	 * Goods or services that are part of a commercial trade agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmGoods
	 * Baseline4.mmGoods}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGoods = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Goods.mmObject();
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "Goods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Goods";
			definition = "Goods or services that are part of a commercial trade agreement.";
			previousVersion_lazy = () -> Baseline4.mmGoods;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentTerms5> paymentTerms;
	/**
	 * Specifies the payment terms by means of a code and a limit in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms5
	 * PaymentTerms5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPaymentTerms
	 * Baseline4.mmPaymentTerms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPaymentObligation;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms by means of a code and a limit in time.";
			previousVersion_lazy = () -> Baseline4.mmPaymentTerms;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTerms5.mmObject();
		}
	};
	protected SettlementTerms3 settlementTerms;
	/**
	 * Specifies how the underlying transaction should be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms3
	 * SettlementTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSettlementTerms
	 * Baseline4.mmSettlementTerms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Specifies how the underlying transaction should be settled.";
			previousVersion_lazy = () -> Baseline4.mmSettlementTerms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTerms3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentObligation2> paymentObligation;
	/**
	 * Specifies the details of the payment obligation between financial
	 * institutions in this transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPaymentObligation
	 * Baseline4.mmPaymentObligation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentObligation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPaymentObligation;
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "PmtOblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the details of the payment obligation between financial institutions in this transaction.";
			previousVersion_lazy = () -> Baseline4.mmPaymentObligation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
		}
	};
	protected ISODate latestMatchDate;
	/**
	 * Specifies the latest date on which a data set must be matched with a
	 * baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmLatestMatchDate
	 * Baseline4.mmLatestMatchDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLatestMatchDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "LatstMtchDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestMatchDate";
			definition = "Specifies the latest date on which a data set must be matched with a baseline.";
			previousVersion_lazy = () -> Baseline4.mmLatestMatchDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected RequiredSubmission2 commercialDataSetRequired;
	/**
	 * Specifies that a commercial data set is required for each shipment part
	 * of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission2
	 * RequiredSubmission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmCommercialDataSetRequired
	 * Baseline4.mmCommercialDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommercialDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "ComrclDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSetRequired";
			definition = "Specifies that a commercial data set is required for each shipment part of the transaction.";
			previousVersion_lazy = () -> Baseline4.mmCommercialDataSetRequired;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission2.mmObject();
		}
	};
	protected RequiredSubmission2 transportDataSetRequired;
	/**
	 * Specifies that a transport data set is required for each shipment part of
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission2
	 * RequiredSubmission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmTransportDataSetRequired
	 * Baseline4.mmTransportDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSetRequired";
			definition = "Specifies that a transport data set is required for each shipment part of the transaction.";
			previousVersion_lazy = () -> Baseline4.mmTransportDataSetRequired;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission2.mmObject();
		}
	};
	protected RequiredSubmission3 insuranceDataSetRequired;
	/**
	 * Specifies that an insurance data set is required for each shipment part
	 * of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmInsuranceDataSetRequired
	 * Baseline4.mmInsuranceDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInsuranceDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "InsrncDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSetRequired";
			definition = "Specifies that an insurance data set is required for each shipment part of the transaction.";
			previousVersion_lazy = () -> Baseline4.mmInsuranceDataSetRequired;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RequiredSubmission4> certificateDataSetRequired;
	/**
	 * Specifies that a certificate data set is required for each shipment part
	 * of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmCertificateDataSetRequired
	 * Baseline4.mmCertificateDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificateDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "CertDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSetRequired";
			definition = "Specifies that a certificate data set is required for each shipment part of the transaction.";
			previousVersion_lazy = () -> Baseline4.mmCertificateDataSetRequired;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RequiredSubmission6> otherCertificateDataSetRequired;
	/**
	 * Specifies that another type of certificate data set is required for each
	 * shipment part of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission6
	 * RequiredSubmission6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmOtherCertificateDataSetRequired
	 * Baseline4.mmOtherCertificateDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCertificateDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "OthrCertDataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSetRequired";
			definition = "Specifies that another type of certificate data set is required for each shipment part of the transaction.";
			previousVersion_lazy = () -> Baseline4.mmOtherCertificateDataSetRequired;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission6.mmObject();
		}
	};
	protected YesNoIndicator intentToPayExpected;
	/**
	 * Specifies that IntentToPayNotice message(s) are expected as part of this
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmIntentToPayExpected
	 * Baseline4.mmIntentToPayExpected}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntentToPayExpected = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Baseline5.mmObject();
			isDerived = false;
			xmlTag = "InttToPayXpctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntentToPayExpected";
			definition = "Specifies that IntentToPayNotice message(s) are expected as part of this transaction.";
			previousVersion_lazy = () -> Baseline4.mmIntentToPayExpected;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Baseline5.mmSubmitterBaselineIdentification, Baseline5.mmServiceCode, Baseline5.mmPurchaseOrderReference, Baseline5.mmBuyer, Baseline5.mmSeller, Baseline5.mmBuyerBank,
						Baseline5.mmSellerBank, Baseline5.mmBuyerSideSubmittingBank, Baseline5.mmSellerSideSubmittingBank, Baseline5.mmBillTo, Baseline5.mmShipTo, Baseline5.mmConsignee, Baseline5.mmGoods, Baseline5.mmPaymentTerms,
						Baseline5.mmSettlementTerms, Baseline5.mmPaymentObligation, Baseline5.mmLatestMatchDate, Baseline5.mmCommercialDataSetRequired, Baseline5.mmTransportDataSetRequired, Baseline5.mmInsuranceDataSetRequired,
						Baseline5.mmCertificateDataSetRequired, Baseline5.mmOtherCertificateDataSetRequired, Baseline5.mmIntentToPayExpected);
				messageBuildingBlock_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmBaseline, BaselineAmendmentRequestV05.mmBaseline, FullPushThroughReportV05.mmPushedThroughBaseline, BaselineReSubmissionV05.mmBaseline);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Baseline5";
				definition = "Specifies the commercial details of the underlying transaction.";
				previousVersion_lazy = () -> Baseline4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1 getSubmitterBaselineIdentification() {
		return submitterBaselineIdentification;
	}

	public void setSubmitterBaselineIdentification(com.tools20022.repository.msg.DocumentIdentification1 submitterBaselineIdentification) {
		this.submitterBaselineIdentification = submitterBaselineIdentification;
	}

	public TradeFinanceService2Code getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(TradeFinanceService2Code serviceCode) {
		this.serviceCode = serviceCode;
	}

	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(com.tools20022.repository.msg.DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public void setBuyer(com.tools20022.repository.msg.PartyIdentification26 buyer) {
		this.buyer = buyer;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public void setSeller(com.tools20022.repository.msg.PartyIdentification26 seller) {
		this.seller = seller;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public void setBuyerBank(com.tools20022.repository.msg.BICIdentification1 buyerBank) {
		this.buyerBank = buyerBank;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public void setSellerBank(com.tools20022.repository.msg.BICIdentification1 sellerBank) {
		this.sellerBank = sellerBank;
	}

	public List<BICIdentification1> getBuyerSideSubmittingBank() {
		return buyerSideSubmittingBank;
	}

	public void setBuyerSideSubmittingBank(List<com.tools20022.repository.msg.BICIdentification1> buyerSideSubmittingBank) {
		this.buyerSideSubmittingBank = buyerSideSubmittingBank;
	}

	public List<BICIdentification1> getSellerSideSubmittingBank() {
		return sellerSideSubmittingBank;
	}

	public void setSellerSideSubmittingBank(List<com.tools20022.repository.msg.BICIdentification1> sellerSideSubmittingBank) {
		this.sellerSideSubmittingBank = sellerSideSubmittingBank;
	}

	public PartyIdentification26 getBillTo() {
		return billTo;
	}

	public void setBillTo(com.tools20022.repository.msg.PartyIdentification26 billTo) {
		this.billTo = billTo;
	}

	public PartyIdentification26 getShipTo() {
		return shipTo;
	}

	public void setShipTo(com.tools20022.repository.msg.PartyIdentification26 shipTo) {
		this.shipTo = shipTo;
	}

	public PartyIdentification26 getConsignee() {
		return consignee;
	}

	public void setConsignee(com.tools20022.repository.msg.PartyIdentification26 consignee) {
		this.consignee = consignee;
	}

	public LineItem13 getGoods() {
		return goods;
	}

	public void setGoods(com.tools20022.repository.msg.LineItem13 goods) {
		this.goods = goods;
	}

	public List<PaymentTerms5> getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(List<com.tools20022.repository.msg.PaymentTerms5> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public SettlementTerms3 getSettlementTerms() {
		return settlementTerms;
	}

	public void setSettlementTerms(com.tools20022.repository.msg.SettlementTerms3 settlementTerms) {
		this.settlementTerms = settlementTerms;
	}

	public List<PaymentObligation2> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.msg.PaymentObligation2> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public ISODate getLatestMatchDate() {
		return latestMatchDate;
	}

	public void setLatestMatchDate(ISODate latestMatchDate) {
		this.latestMatchDate = latestMatchDate;
	}

	public RequiredSubmission2 getCommercialDataSetRequired() {
		return commercialDataSetRequired;
	}

	public void setCommercialDataSetRequired(com.tools20022.repository.msg.RequiredSubmission2 commercialDataSetRequired) {
		this.commercialDataSetRequired = commercialDataSetRequired;
	}

	public RequiredSubmission2 getTransportDataSetRequired() {
		return transportDataSetRequired;
	}

	public void setTransportDataSetRequired(com.tools20022.repository.msg.RequiredSubmission2 transportDataSetRequired) {
		this.transportDataSetRequired = transportDataSetRequired;
	}

	public RequiredSubmission3 getInsuranceDataSetRequired() {
		return insuranceDataSetRequired;
	}

	public void setInsuranceDataSetRequired(com.tools20022.repository.msg.RequiredSubmission3 insuranceDataSetRequired) {
		this.insuranceDataSetRequired = insuranceDataSetRequired;
	}

	public List<RequiredSubmission4> getCertificateDataSetRequired() {
		return certificateDataSetRequired;
	}

	public void setCertificateDataSetRequired(List<com.tools20022.repository.msg.RequiredSubmission4> certificateDataSetRequired) {
		this.certificateDataSetRequired = certificateDataSetRequired;
	}

	public List<RequiredSubmission6> getOtherCertificateDataSetRequired() {
		return otherCertificateDataSetRequired;
	}

	public void setOtherCertificateDataSetRequired(List<com.tools20022.repository.msg.RequiredSubmission6> otherCertificateDataSetRequired) {
		this.otherCertificateDataSetRequired = otherCertificateDataSetRequired;
	}

	public YesNoIndicator getIntentToPayExpected() {
		return intentToPayExpected;
	}

	public void setIntentToPayExpected(YesNoIndicator intentToPayExpected) {
		this.intentToPayExpected = intentToPayExpected;
	}
}