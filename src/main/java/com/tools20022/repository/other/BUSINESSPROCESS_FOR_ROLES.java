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

package com.tools20022.repository.other;

import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * (No doc)
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessProcess#getBusinessRole
 * businessRole} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmOrderGiver
 * BUSINESSPROCESS_FOR_ROLES.mmOrderGiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTrustee
 * BUSINESSPROCESS_FOR_ROLES.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmAffirmingParty
 * BUSINESSPROCESS_FOR_ROLES.mmAffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmExecutingBroker
 * BUSINESSPROCESS_FOR_ROLES.mmExecutingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInstitutionalInvestor
 * BUSINESSPROCESS_FOR_ROLES.mmInstitutionalInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmPrimeBroker
 * BUSINESSPROCESS_FOR_ROLES.mmPrimeBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmUnderwriter
 * BUSINESSPROCESS_FOR_ROLES.mmUnderwriter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCentralMatchingUtility
 * BUSINESSPROCESS_FOR_ROLES.mmCentralMatchingUtility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmNonClearingMember
 * BUSINESSPROCESS_FOR_ROLES.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmClearingMember
 * BUSINESSPROCESS_FOR_ROLES.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmMasterTerminalManager
 * BUSINESSPROCESS_FOR_ROLES.mmMasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTerminalManager
 * BUSINESSPROCESS_FOR_ROLES.mmTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmBuyer
 * BUSINESSPROCESS_FOR_ROLES.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmBuyersBank
 * BUSINESSPROCESS_FOR_ROLES.mmBuyersBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSeller
 * BUSINESSPROCESS_FOR_ROLES.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSellersBank
 * BUSINESSPROCESS_FOR_ROLES.mmSellersBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmAcquirer
 * BUSINESSPROCESS_FOR_ROLES.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCardAcceptor
 * BUSINESSPROCESS_FOR_ROLES.mmCardAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCardholder
 * BUSINESSPROCESS_FOR_ROLES.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmMerchant
 * BUSINESSPROCESS_FOR_ROLES.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCreditorAgent
 * BUSINESSPROCESS_FOR_ROLES.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCreditorSendingParty
 * BUSINESSPROCESS_FOR_ROLES.mmCreditorSendingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmDebtorAgent
 * BUSINESSPROCESS_FOR_ROLES.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmDebtorReceivingParty
 * BUSINESSPROCESS_FOR_ROLES.mmDebtorReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCollateralGiver
 * BUSINESSPROCESS_FOR_ROLES.mmCollateralGiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCollateralTaker
 * BUSINESSPROCESS_FOR_ROLES.mmCollateralTaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCAAccountServicer
 * BUSINESSPROCESS_FOR_ROLES.mmCAAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCAAccountOwner
 * BUSINESSPROCESS_FOR_ROLES.mmCAAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.mmSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmGlobalSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.mmGlobalSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmLocalSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.mmLocalSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInterestedAgent
 * BUSINESSPROCESS_FOR_ROLES.mmInterestedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmRegulator
 * BUSINESSPROCESS_FOR_ROLES.mmRegulator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvestor
 * BUSINESSPROCESS_FOR_ROLES.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmMarketMaker
 * BUSINESSPROCESS_FOR_ROLES.mmMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTradingParty
 * BUSINESSPROCESS_FOR_ROLES.mmTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvestmentDecisionMaker
 * BUSINESSPROCESS_FOR_ROLES.mmInvestmentDecisionMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTradeInstructor
 * BUSINESSPROCESS_FOR_ROLES.mmTradeInstructor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmPostTradeAdministrator
 * BUSINESSPROCESS_FOR_ROLES.mmPostTradeAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTrader
 * BUSINESSPROCESS_FOR_ROLES.mmTrader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInfrastructure
 * BUSINESSPROCESS_FOR_ROLES.mmInfrastructure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmConfirmationParty
 * BUSINESSPROCESS_FOR_ROLES.mmConfirmationParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCentralCounterparty
 * BUSINESSPROCESS_FOR_ROLES.mmCentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCentralSecuritiesDepository
 * BUSINESSPROCESS_FOR_ROLES.mmCentralSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSystemTransactionAdministrator
 * BUSINESSPROCESS_FOR_ROLES.mmSystemTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmThirdParty
 * BUSINESSPROCESS_FOR_ROLES.mmThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSystemMember
 * BUSINESSPROCESS_FOR_ROLES.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSystemDirectMember
 * BUSINESSPROCESS_FOR_ROLES.mmSystemDirectMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSystemIndirectMember
 * BUSINESSPROCESS_FOR_ROLES.mmSystemIndirectMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmAgent
 * BUSINESSPROCESS_FOR_ROLES.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmAgreementParty
 * BUSINESSPROCESS_FOR_ROLES.mmAgreementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInitiatingParty
 * BUSINESSPROCESS_FOR_ROLES.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmDebitParty
 * BUSINESSPROCESS_FOR_ROLES.mmDebitParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCreditParty
 * BUSINESSPROCESS_FOR_ROLES.mmCreditParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmPaymentClearingAgent
 * BUSINESSPROCESS_FOR_ROLES.mmPaymentClearingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmPaymentSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.mmPaymentSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFinalAgent
 * BUSINESSPROCESS_FOR_ROLES.mmFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFirstAgent
 * BUSINESSPROCESS_FOR_ROLES.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmForwardingAgent
 * BUSINESSPROCESS_FOR_ROLES.mmForwardingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCreditor
 * BUSINESSPROCESS_FOR_ROLES.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmDebtor
 * BUSINESSPROCESS_FOR_ROLES.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFinalParty
 * BUSINESSPROCESS_FOR_ROLES.mmFinalParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmOriginatingParty
 * BUSINESSPROCESS_FOR_ROLES.mmOriginatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTransferAgent
 * BUSINESSPROCESS_FOR_ROLES.mmTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmIntermediary
 * BUSINESSPROCESS_FOR_ROLES.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCustodian
 * BUSINESSPROCESS_FOR_ROLES.mmCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmPayingAgent
 * BUSINESSPROCESS_FOR_ROLES.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFundAccountant
 * BUSINESSPROCESS_FOR_ROLES.mmFundAccountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvestmentManager
 * BUSINESSPROCESS_FOR_ROLES.mmInvestmentManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFundManagementCompany
 * BUSINESSPROCESS_FOR_ROLES.mmFundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmRegistrar
 * BUSINESSPROCESS_FOR_ROLES.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCashCorrespondent
 * BUSINESSPROCESS_FOR_ROLES.mmCashCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmDataProvider
 * BUSINESSPROCESS_FOR_ROLES.mmDataProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmTreasurySettlementParty
 * BUSINESSPROCESS_FOR_ROLES.mmTreasurySettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmBuySideParty
 * BUSINESSPROCESS_FOR_ROLES.mmBuySideParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmRedistributorAgent
 * BUSINESSPROCESS_FOR_ROLES.mmRedistributorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSellSideParty
 * BUSINESSPROCESS_FOR_ROLES.mmSellSideParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvoicee
 * BUSINESSPROCESS_FOR_ROLES.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvoicer
 * BUSINESSPROCESS_FOR_ROLES.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmAccountOwner
 * BUSINESSPROCESS_FOR_ROLES.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmAccountServicer
 * BUSINESSPROCESS_FOR_ROLES.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCaseAssignee
 * BUSINESSPROCESS_FOR_ROLES.mmCaseAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCaseAssigner
 * BUSINESSPROCESS_FOR_ROLES.mmCaseAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvestigationManager
 * BUSINESSPROCESS_FOR_ROLES.mmInvestigationManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFacilitator
 * BUSINESSPROCESS_FOR_ROLES.mmFacilitator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmProxyVotingInitiator
 * BUSINESSPROCESS_FOR_ROLES.mmProxyVotingInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmProxyInformationProvider
 * BUSINESSPROCESS_FOR_ROLES.mmProxyInformationProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCustodyServiceProvider
 * BUSINESSPROCESS_FOR_ROLES.mmCustodyServiceProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmLocalMarketIntermediary
 * BUSINESSPROCESS_FOR_ROLES.mmLocalMarketIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmVotingParty
 * BUSINESSPROCESS_FOR_ROLES.mmVotingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInvestigator
 * BUSINESSPROCESS_FOR_ROLES.mmInvestigator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCorporateInvestigator
 * BUSINESSPROCESS_FOR_ROLES.mmCorporateInvestigator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFinancialInvestigator
 * BUSINESSPROCESS_FOR_ROLES.mmFinancialInvestigator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCentralSettlementSystem
 * BUSINESSPROCESS_FOR_ROLES.mmCentralSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSettlementMember
 * BUSINESSPROCESS_FOR_ROLES.mmSettlementMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmReportingInstitution
 * BUSINESSPROCESS_FOR_ROLES.mmReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmFinancialInstitutionApplication
 * BUSINESSPROCESS_FOR_ROLES.mmFinancialInstitutionApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmNonFinancialInstitutionApplication
 * BUSINESSPROCESS_FOR_ROLES.mmNonFinancialInstitutionApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmSystemApplication
 * BUSINESSPROCESS_FOR_ROLES.mmSystemApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmCSDParticipant
 * BUSINESSPROCESS_FOR_ROLES.mmCSDParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmInternationalCentralSecuritiesDepository
 * BUSINESSPROCESS_FOR_ROLES.mmInternationalCentralSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmIssuer
 * BUSINESSPROCESS_FOR_ROLES.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmIssuerAgent
 * BUSINESSPROCESS_FOR_ROLES.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmNationalCentralBank
 * BUSINESSPROCESS_FOR_ROLES.mmNationalCentralBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#mmStockExchange
 * BUSINESSPROCESS_FOR_ROLES.mmStockExchange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BUSINESSPROCESS_FOR_ROLES"</li>
 * </ul>
 */
public class BUSINESSPROCESS_FOR_ROLES {

	final static private AtomicReference<MMBusinessProcess> mmObject_lazy = new AtomicReference<>();
	/**
	 * Firm which instructs an order, also known as the ordering firm or
	 * orderer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderGiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Firm which instructs an order, also known as the ordering firm or orderer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmOrderGiver = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderGiver";
			definition = "Firm which instructs an order, also known as the ordering firm or orderer.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Individual or institution who holds or manages assets for the benefit of
	 * another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trustee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual or institution who holds or manages assets for the benefit of another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTrustee = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Individual or institution who holds or manages assets for the benefit of another.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which affirms the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which affirms the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmAffirmingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party which affirms the trade.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution that partners with the investment manager to
	 * communicate details, execute modifications and settle financial
	 * instrument transactions. The executing broker generally executes the
	 * trade in the local market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that partners with the investment manager to communicate details, execute modifications and settle financial instrument transactions. The executing broker generally executes the trade in the local market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmExecutingBroker = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBroker";
			definition = "Financial institution that partners with the investment manager to communicate details, execute modifications and settle financial instrument transactions. The executing broker generally executes the trade in the local market.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Pension funds, mutual funds, money managers, insurance company,
	 * investment banks, commercial trusts, endowment funds, hedge funds,
	 * accountable for high volumes of trades, moving large blocks of shares on
	 * the stock market's movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionalInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pension funds, mutual funds, money managers, insurance company, investment banks, commercial trusts, endowment funds, hedge funds, accountable for high volumes of trades, moving large blocks of shares on the stock market's movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInstitutionalInvestor = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionalInvestor";
			definition = "Pension funds, mutual funds, money managers, insurance company, investment banks, commercial trusts, endowment funds, hedge funds, accountable for high volumes of trades, moving large blocks of shares on the stock market's movements.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial insitution that acts as settlement agent, provides custody for
	 * assets, provides financing for leverage, and prepares daily account
	 * statements for its clients, who are money managers, hedge funds, market
	 * makers, arbitrageurs, specialists and other professional investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimeBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial insitution that acts as settlement agent, provides custody for assets, provides financing for leverage, and prepares daily account statements for its clients, who are money managers, hedge funds, market makers, arbitrageurs, specialists and other professional investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmPrimeBroker = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimeBroker";
			definition = "Financial insitution that acts as settlement agent, provides custody for assets, provides financing for leverage, and prepares daily account statements for its clients, who are money managers, hedge funds, market makers, arbitrageurs, specialists and other professional investors.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Company or other entity that administers the public issuance and
	 * distribution of securities from a corporation or other issuing body.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underwriter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Company or other entity that administers the public issuance and distribution of securities from a corporation or other issuing body."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmUnderwriter = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underwriter";
			definition = "Company or other entity that administers the public issuance and distribution of securities from a corporation or other issuing body.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Mediates communication between the broker/dealer and investment manager
	 * to exchange trade details, match settlement criteria and confirm
	 * completion of financial instrument transactions. The Central Matching
	 * Utility (CMU) may be operated as a separate utility or as part of another
	 * market utility, for example, a Central Securities Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralMatchingUtility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mediates communication between the broker/dealer and investment manager to exchange trade details, match settlement criteria and confirm completion of financial instrument transactions. The Central Matching Utility (CMU) may be operated as a separate utility or as part of another market utility, for example, a Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCentralMatchingUtility = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralMatchingUtility";
			definition = "Mediates communication between the broker/dealer and investment manager to exchange trade details, match settlement criteria and confirm completion of financial instrument transactions. The Central Matching Utility (CMU) may be operated as a separate utility or as part of another market utility, for example, a Central Securities Depository (CSD).";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party (an exchange member firm) that chooses not to clear transactions,
	 * and uses/subcontracts a general clearing member to access the central
	 * counterparty ’s services. All trades must be cleared through a clearing
	 * member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (an exchange member firm) that chooses not to clear transactions, and uses/subcontracts a general clearing member to access the central counterparty ’s services. All trades must be cleared through a clearing member."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmNonClearingMember = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Party (an exchange member firm) that chooses not to clear transactions, and uses/subcontracts a general clearing member to access the central counterparty ’s services. All trades must be cleared through a clearing member.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is a member of a clearing house. All trades must be settled
	 * through a clearing member. There are two types of clearing members:<br>
	 * <br>
	 * - a general clearing member is able to settle its own obligations as well
	 * as those of clients. However, so-called general clearing members may
	 * settle both their own obligations and those of their customers.<br>
	 * - a direct clearing member is able to settle only its own obligations.<br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is a member of a clearing house. All trades must be settled through a clearing member. There are two types of clearing members:\r\n\r\n- a general clearing member is able to settle its own obligations as well as those of clients. However, so-called general clearing members may settle both their own obligations and those of their customers.\r\n- a direct clearing member is able to settle only its own obligations.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmClearingMember = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Party that is a member of a clearing house. All trades must be settled through a clearing member. There are two types of clearing members:\r\n\r\n- a general clearing member is able to settle its own obligations as well as those of clients. However, so-called general clearing members may settle both their own obligations and those of their customers.\r\n- a direct clearing member is able to settle only its own obligations.\r\n\r\n";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which is responsible for the point of interaction (POI), and has
	 * the control of the access rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which is responsible for the point of interaction (POI), and has the control of the access rights."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmMasterTerminalManager = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterTerminalManager";
			definition = "Party which is responsible for the point of interaction (POI), and has the control of the access rights.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which is responsible for one security domain of the point of
	 * interaction (POI) application. The master terminal manager (MTM)
	 * delegates the necessary access rights for the terminal manager (TM)
	 * configuration tasks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which is responsible for one security domain of the point of interaction (POI) application. The master terminal manager (MTM) delegates the necessary access rights for the terminal manager (TM) configuration tasks."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTerminalManager = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManager";
			definition = "Party which is responsible for one security domain of the point of interaction (POI) application. The master terminal manager (MTM) delegates the necessary access rights for the terminal manager (TM) configuration tasks.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which acquires, or agrees to acquire, ownership (in case of goods),
	 * or benefit or usage (in case of services), in exchange for money or other
	 * consideration under a contract of sale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which acquires, or agrees to acquire, ownership (in case of goods), or benefit or usage (in case of services), in exchange for money or other consideration under a contract of sale."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmBuyer = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party which acquires, or agrees to acquire, ownership (in case of goods), or benefit or usage (in case of services), in exchange for money or other consideration under a contract of sale.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution that holds the buyer's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyersBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial institution that holds the buyer's account."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmBuyersBank = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyersBank";
			definition = "Financial institution that holds the buyer's account.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Entity that makes, or offers or contracts to make, a sale to an actual or
	 * potential buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that makes, or offers or contracts to make, a sale to an actual or potential buyer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSeller = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Entity that makes, or offers or contracts to make, a sale to an actual or potential buyer.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution that holds the seller's account .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellersBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial institution that holds the seller's account ."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSellersBank = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellersBank";
			definition = "Financial institution that holds the seller's account .";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party in contractual relation with merchants and card schemes accepting
	 * payments, that acquires card payment from the merchant, forwards the
	 * transaction to the relevant card issuer, and makes payments to the
	 * merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in contractual relation with merchants and card schemes accepting payments, that acquires card payment from the merchant, forwards the transaction to the relevant card issuer, and makes payments to the merchant."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmAcquirer = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Acquirer";
			definition = "Party in contractual relation with merchants and card schemes accepting payments, that acquires card payment from the merchant, forwards the transaction to the relevant card issuer, and makes payments to the merchant.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party accepting the card and presenting transaction data to the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party accepting the card and presenting transaction data to the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCardAcceptor = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardAcceptor";
			definition = "Party accepting the card and presenting transaction data to the acquirer.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party who presents the card to the merchant for provision of goods or
	 * services. The cardholder signs the agreement with the card issuer to use
	 * a card linked to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who presents the card to the merchant for provision of goods or services. The cardholder signs the agreement with the card issuer to use a card linked to an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCardholder = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cardholder";
			definition = "Party who presents the card to the merchant for provision of goods or services. The cardholder signs the agreement with the card issuer to use a card linked to an account.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party who provides goods or services at one or several sites (physical or
	 * virtual). The merchant signs the acquiring agreement with the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who provides goods or services at one or several sites (physical or virtual). The merchant signs the acquiring agreement with the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmMerchant = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Party who provides goods or services at one or several sites (physical or virtual). The merchant signs the acquiring agreement with the acquirer.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the Creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the Creditor."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCreditorAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the Creditor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party initiating the payment request to an agent. In the payment request
	 * context, this can either be the creator, or a party that initiates the
	 * payment request on behalf of the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorSendingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party initiating the payment request to an agent. In the payment request context, this can either be the creator, or a party that initiates the payment request on behalf of the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCreditorSendingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSendingParty";
			definition = "Party initiating the payment request to an agent. In the payment request context, this can either be the creator, or a party that initiates the payment request on behalf of the creditor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the Debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the Debtor."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmDebtorAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the Debtor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * The Debtor himself or a party receiving the Creditor Payment Activation
	 * Request on behalf of the Debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorReceivingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Debtor himself or a party receiving the Creditor Payment Activation Request on behalf of the Debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmDebtorReceivingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorReceivingParty";
			definition = "The Debtor himself or a party receiving the Creditor Payment Activation Request on behalf of the Debtor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Entity that is associated with the collateral agreement and that will
	 * deliver collateral to secure an obligation vis-à-vis the other party (the
	 * collateral taker).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralGiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that is associated with the collateral agreement and that will deliver collateral to secure an obligation vis-à-vis the other party (the collateral taker)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCollateralGiver = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralGiver";
			definition = "Entity that is associated with the collateral agreement and that will deliver collateral to secure an obligation vis-à-vis the other party (the collateral taker).";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Entity that is associated with the collateral agreement and that will
	 * receive collateral from the other party (the collateral giver).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that is associated with the collateral agreement and that will receive collateral from the other party (the collateral giver)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCollateralTaker = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralTaker";
			definition = "Entity that is associated with the collateral agreement and that will receive collateral from the other party (the collateral giver).";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CAAccountServicer"</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCAAccountServicer = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CAAccountServicer";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CAAccountOwner"</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCAAccountOwner = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CAAccountOwner";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that provides settlement, custody, and accounting services for its
	 * own, or someone else's, assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides settlement, custody, and accounting services for its own, or someone else's, assets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAgent";
			definition = "Party that provides settlement, custody, and accounting services for its own, or someone else's, assets.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that holds another party's inventory of financial instruments, and
	 * effects or receives deliveries versus payment, or free of payment.
	 * Deliveries, receipts, and payments may be effected within the facilities
	 * of the global settlement agent, or within the facilities of a local
	 * settlement agent, and directed by the global settlement agent. A global
	 * settlement agent may be a custodian and/or a clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that holds another party's inventory of financial instruments, and effects or receives deliveries versus payment, or free of payment. Deliveries, receipts, and payments may be effected within the facilities of the global settlement agent, or within the facilities of a local settlement agent, and directed by the global settlement agent. A global settlement agent may be a custodian and/or a clearing broker."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmGlobalSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalSettlementAgent";
			definition = "Party that holds another party's inventory of financial instruments, and effects or receives deliveries versus payment, or free of payment. Deliveries, receipts, and payments may be effected within the facilities of the global settlement agent, or within the facilities of a local settlement agent, and directed by the global settlement agent. A global settlement agent may be a custodian and/or a clearing broker.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that holds a portion of another party's inventory of financial
	 * instruments within a location or market, effects or receives local
	 * deliveries versus payment, or free of payment, as directed by the global
	 * settlement agent. A local settlement agent may be a local custodian
	 * and/or a local clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that holds a portion of another party's inventory of financial instruments within a location or market, effects or receives local deliveries versus payment, or free of payment, as directed by the global settlement agent. A local settlement agent may be a local custodian and/or a local clearing broker."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmLocalSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalSettlementAgent";
			definition = "Party that holds a portion of another party's inventory of financial instruments within a location or market, effects or receives local deliveries versus payment, or free of payment, as directed by the global settlement agent. A local settlement agent may be a local custodian and/or a local clearing broker.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that receives information from other parties about transactions
	 * that are being processed, and performs functions such as regulatory
	 * oversight and accounting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives information from other parties about transactions that are being processed, and performs functions such as regulatory oversight and accounting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInterestedAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestedAgent";
			definition = "Party that receives information from other parties about transactions that are being processed, and performs functions such as regulatory oversight and accounting.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Government agency, or a self-regulated body, that sets the rules for the
	 * regulation of the market, as well as the relationship between the
	 * different parties in the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Government agency, or a self-regulated body, that sets the rules for the regulation of the market, as well as the relationship between the different parties in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmRegulator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Regulator";
			definition = "Government agency, or a self-regulated body, that sets the rules for the regulation of the market, as well as the relationship between the different parties in the market.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvestor = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that makes a market in one or more specific instruments. May
	 * frequently adjust or revise the published quote depending on market
	 * conditions but may be prohibited from withdrawing it. Will often function
	 * within an organized market, eg, a stock exchange, in which case it's
	 * quotes and trades are made within the context of the market's rules and
	 * membership criteria.<br>
	 * To make a market in an instrument, a party must extend a continuous offer
	 * to buy or sell financial instruments with any qualified counterparty at a
	 * price quote published by the party, without respect to the identity of
	 * the qualified counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that makes a market in one or more specific instruments. May frequently adjust or revise the published quote depending on market conditions but may be prohibited from withdrawing it. Will often function within an organized market, eg, a stock exchange, in which case it's quotes and trades are made within the context of the market's rules and membership criteria.\r\nTo make a market in an instrument, a party must extend a continuous offer to buy or sell financial instruments with any qualified counterparty at a price quote published by the party, without respect to the identity of the qualified counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmMarketMaker = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketMaker";
			definition = "Party that makes a market in one or more specific instruments. May frequently adjust or revise the published quote depending on market conditions but may be prohibited from withdrawing it. Will often function within an organized market, eg, a stock exchange, in which case it's quotes and trades are made within the context of the market's rules and membership criteria.\r\nTo make a market in an instrument, a party must extend a continuous offer to buy or sell financial instruments with any qualified counterparty at a price quote published by the party, without respect to the identity of the qualified counterparty.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that plays an active role in planning and executing the
	 * transactions that create or liquidate investments of the investors
	 * assets, or that move the investor's assets from one investment to
	 * another. A trading party is a trade instructor, an investment
	 * decision-maker, a post trade administrator, or a trader. In the context
	 * of treasury, it is the party negotiates and executes the treasury
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that plays an active role in planning and executing the transactions that create or liquidate investments of the investors assets, or that move the investor's assets from one investment to another. A trading party is a trade instructor, an investment decision-maker, a post trade administrator, or a trader. In the context of treasury, it is the party negotiates and executes the treasury transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTradingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingParty";
			definition = "Party that plays an active role in planning and executing the transactions that create or liquidate investments of the investors assets, or that move the investor's assets from one investment to another. A trading party is a trade instructor, an investment decision-maker, a post trade administrator, or a trader. In the context of treasury, it is the party negotiates and executes the treasury transaction.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Individual investor that makes its own investment decision, a financial
	 * analyst that advises the investor, or a portfolio manager that has
	 * received the investor's cash to be invested. It decides upon an
	 * investment strategy for the investor's assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentDecisionMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual investor that makes its own investment decision, a financial analyst that advises the investor, or a portfolio manager that has received the investor's cash to be invested. It decides upon an investment strategy for the investor's assets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvestmentDecisionMaker = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentDecisionMaker";
			definition = "Individual investor that makes its own investment decision, a financial analyst that advises the investor, or a portfolio manager that has received the investor's cash to be invested. It decides upon an investment strategy for the investor's assets.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that decides upon one or more specific trades to follow the
	 * investment decision maker's strategy. This may be an individual within an
	 * investment firm, that selects a market in which to execute the investment
	 * decision maker's orders, and adds instructions for hedging and
	 * leveraging.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeInstructor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that decides upon one or more specific trades to follow the investment decision maker's strategy. This may be an individual within an investment firm, that selects a market in which to execute the investment decision maker's orders, and adds instructions for hedging and leveraging."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTradeInstructor = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeInstructor";
			definition = "Party that decides upon one or more specific trades to follow the investment decision maker's strategy. This may be an individual within an investment firm, that selects a market in which to execute the investment decision maker's orders, and adds instructions for hedging and leveraging.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party ensuring thatall the details of the trade have been collected and
	 * reported, as required to all parties involved in the trade transaction
	 * including counterparties, the investor, and settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostTradeAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party ensuring thatall the details of the trade have been collected and reported, as required to all parties involved in the trade transaction including counterparties, the investor, and settlement parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmPostTradeAdministrator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostTradeAdministrator";
			definition = "Party ensuring thatall the details of the trade have been collected and reported, as required to all parties involved in the trade transaction including counterparties, the investor, and settlement parties.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that interacts with counterparties in the context of a market (that
	 * is, an exchange, network, or over-the-counter network), to execute
	 * trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that interacts with counterparties in the context of a market (that is, an exchange, network, or over-the-counter network), to execute trades."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTrader = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trader";
			definition = "Party that interacts with counterparties in the context of a market (that is, an exchange, network, or over-the-counter network), to execute trades.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that provides, through common membership, services to create a fair
	 * and open process for the execution of transactions between trading
	 * parties, and the creation of settlement obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Infrastructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides, through common membership, services to create a fair and open process for the execution of transactions between trading parties, and the creation of settlement obligations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInfrastructure = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Infrastructure";
			definition = "Party that provides, through common membership, services to create a fair and open process for the execution of transactions between trading parties, and the creation of settlement obligations.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Infrastructure that issues trade confirmations, receives trade
	 * affirmations, matches allocations to confirmations and confirmations to
	 * instructions, and generates standing or special instructions to create
	 * settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure that issues trade confirmations, receives trade affirmations, matches allocations to confirmations and confirmations to instructions, and generates standing or special instructions to create settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmConfirmationParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationParty";
			definition = "Infrastructure that issues trade confirmations, receives trade affirmations, matches allocations to confirmations and confirmations to instructions, and generates standing or special instructions to create settlement instructions.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Infrastructure that is very often a component of a clearinghouse, and
	 * facilitates clearing and settlement for its members by standing between
	 * the buyer and the seller of a trade. It may net transactions, and
	 * substitutes itself as a settlement counterparty to each position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure that is very often a component of a clearinghouse, and facilitates clearing and settlement for its members by standing between the buyer and the seller of a trade. It may net transactions, and substitutes itself as a settlement counterparty to each position."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCentralCounterparty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralCounterparty";
			definition = "Infrastructure that is very often a component of a clearinghouse, and facilitates clearing and settlement for its members by standing between the buyer and the seller of a trade. It may net transactions, and substitutes itself as a settlement counterparty to each position.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Infrastructure that, holds or controls, the holding of physical or
	 * dematerialised financial instruments belonging to all, or a large portion
	 * of, the investors in a securities market. This effects the centralised
	 * transfer of ownership of such securities by entries on its books and
	 * records.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure that, holds or controls, the holding of physical or dematerialised financial instruments belonging to all, or a large portion of, the investors in a securities market. This effects the centralised transfer of ownership of such securities by entries on its books and records."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCentralSecuritiesDepository = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralSecuritiesDepository";
			definition = "Infrastructure that, holds or controls, the holding of physical or dematerialised financial instruments belonging to all, or a large portion of, the investors in a securities market. This effects the centralised transfer of ownership of such securities by entries on its books and records.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * In a central system, the entity or neutral body, in charge of providing
	 * services to the system's members. It is in charge of performing specified
	 * tasks on behalf and under the responsibility of the system's direct
	 * members. It can be a matching engine, a settlement engine, or a financial
	 * institution. It also maintains accounts or netting positions for the
	 * direct members of the system, registers transactions, performs checks and
	 * validations, and manages the settlement cycle or other value added
	 * processes, as specified in the functional specifications of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a central system, the entity or neutral body, in charge of providing services to the system's members. It is in charge of performing specified tasks on behalf and under the responsibility of the system's direct members. It can be a matching engine, a settlement engine, or a financial institution. It also maintains accounts or netting positions for the direct members of the system, registers transactions, performs checks and validations, and manages the settlement cycle or other value added processes, as specified in the functional specifications of the system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSystemTransactionAdministrator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemTransactionAdministrator";
			definition = "In a central system, the entity or neutral body, in charge of providing services to the system's members. It is in charge of performing specified tasks on behalf and under the responsibility of the system's direct members. It can be a matching engine, a settlement engine, or a financial institution. It also maintains accounts or netting positions for the direct members of the system, registers transactions, performs checks and validations, and manages the settlement cycle or other value added processes, as specified in the functional specifications of the system.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is a customer of either a direct or indirect system member. It
	 * is not known by the system transaction administrator, and does not have
	 * any liability nor rights, vis-a-vis the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is a customer of either a direct or indirect system member. It is not known by the system transaction administrator, and does not have any liability nor rights, vis-a-vis the system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmThirdParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdParty";
			definition = "Party that is a customer of either a direct or indirect system member. It is not known by the system transaction administrator, and does not have any liability nor rights, vis-a-vis the system.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is entitled to make full or partial use of the system
	 * transaction administrator, to make it perform business processes on its
	 * behalf. A member can submit transactions, and request and/or receive
	 * information. A member can be a direct or indirect member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is entitled to make full or partial use of the system transaction administrator, to make it perform business processes on its behalf. A member can submit transactions, and request and/or receive information. A member can be a direct or indirect member."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSystemMember = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemMember";
			definition = "Party that is entitled to make full or partial use of the system transaction administrator, to make it perform business processes on its behalf. A member can submit transactions, and request and/or receive information. A member can be a direct or indirect member.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is a member, and granted full access to the functions of the
	 * system transaction administrator. A direct member owns an account with
	 * the system transaction administrator and is entitled to input
	 * transactions on its own behalf and on behalf of sponsored indirect
	 * members or customers.<br>
	 * It is ultimately responsible for any financial liability due to its
	 * membership level. All business processes performed by the system
	 * transaction administrator are made under the financial responsibility of
	 * the direct members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDirectMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is a member, and granted full access to the functions of the system transaction administrator. A direct member owns an account with the system transaction administrator and is entitled to input transactions on its own behalf and on behalf of sponsored indirect members or customers.\r\nIt is ultimately responsible for any financial liability due to its membership level. All business processes performed by the system transaction administrator are made under the financial responsibility of the direct members."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSystemDirectMember = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemDirectMember";
			definition = "Party that is a member, and granted full access to the functions of the system transaction administrator. A direct member owns an account with the system transaction administrator and is entitled to input transactions on its own behalf and on behalf of sponsored indirect members or customers.\r\nIt is ultimately responsible for any financial liability due to its membership level. All business processes performed by the system transaction administrator are made under the financial responsibility of the direct members.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is sponsored by a direct member, and has limited access to the
	 * system transaction administrator functions. An indirect member does not
	 * own an account with the system transaction administrator, and can only
	 * submit transactions for settlement on its direct member account. Access
	 * to information and functions offered by the system transaction
	 * administrator are dependent upon the system considered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIndirectMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is sponsored by a direct member, and has limited access to the system transaction administrator functions. An indirect member does not own an account with the system transaction administrator, and can only submit transactions for settlement on its direct member account. Access to information and functions offered by the system transaction administrator are dependent upon the system considered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSystemIndirectMember = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemIndirectMember";
			definition = "Party that is sponsored by a direct member, and has limited access to the system transaction administrator functions. An indirect member does not own an account with the system transaction administrator, and can only submit transactions for settlement on its direct member account. Access to information and functions offered by the system transaction administrator are dependent upon the system considered.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that acts on behalf, or upon request, of another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf, or upon request, of another party."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agent";
			definition = "Party that acts on behalf, or upon request, of another party.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party involved in a - usually commercial (buying, selling, acquiring,
	 * providing products or services) - relationship, which materialises in an
	 * agreement with a counterparty. Both counterparties are also referred to
	 * as agreement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party involved in a - usually commercial (buying, selling, acquiring, providing products or services) - relationship, which materialises in an agreement with a counterparty. Both counterparties are also referred to as agreement parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmAgreementParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgreementParty";
			definition = "Party involved in a - usually commercial (buying, selling, acquiring, providing products or services) - relationship, which materialises in an agreement with a counterparty. Both counterparties are also referred to as agreement parties.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party initiating the payment to an agent. In the payment context, this
	 * can either be the debtor (in a credit transfer), the creditor (in a
	 * direct debit), or a party that initiates the payment on behalf of the
	 * debtor or creditor. In the context of treasury, the party that instructs
	 * the trading party to execute a treasury deal on its behalf.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party initiating the payment to an agent. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or a party that initiates the payment on behalf of the debtor or creditor. In the context of treasury, the party that instructs the trading party to execute a treasury deal on its behalf."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInitiatingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitiatingParty";
			definition = "Party initiating the payment to an agent. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or a party that initiates the payment on behalf of the debtor or creditor. In the context of treasury, the party that instructs the trading party to execute a treasury deal on its behalf.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that gives cash. In the payment chain, it may be an agent or the
	 * debtor. Furthermore, for each pair of consecutive parties in the payment
	 * chain, one party always plays the role of the debit party, and the other,
	 * the role of the credit party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that gives cash. In the payment chain, it may be an agent or the debtor. Furthermore, for each pair of consecutive parties in the payment chain, one party always plays the role of the debit party, and the other, the role of the credit party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmDebitParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitParty";
			definition = "Party that gives cash. In the payment chain, it may be an agent or the debtor. Furthermore, for each pair of consecutive parties in the payment chain, one party always plays the role of the debit party, and the other, the role of the credit party.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that receives the cash. In the payment chain, it may be an agent or
	 * the creditor. Furthermore, for each pair of consecutive parties in the
	 * payment chain, one party always plays the role of the debit party, and
	 * the other, the role of the credit party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives the cash. In the payment chain, it may be an agent or the creditor.  Furthermore, for each pair of consecutive parties in the payment chain, one party always plays the role of the debit party, and the other, the role of the credit party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCreditParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditParty";
			definition = "Party that receives the cash. In the payment chain, it may be an agent or the creditor.  Furthermore, for each pair of consecutive parties in the payment chain, one party always plays the role of the debit party, and the other, the role of the credit party.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Agent that instructs the next party in the payment chain to carry out the
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentClearingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the payment chain to carry out the payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmPaymentClearingAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentClearingAgent";
			definition = "Agent that instructs the next party in the payment chain to carry out the payment.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Agent that executes the cash transfer upon the request of either an
	 * agreement party, or a clearing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that executes the cash transfer upon the request of either an agreement party, or a clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmPaymentSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSettlementAgent";
			definition = "Agent that executes the cash transfer upon the request of either an agreement party, or a clearing agent.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution that receives the payment transaction on behalf of
	 * an account owner, or other nominated party, and credits the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFinalAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalAgent";
			definition = "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution that receives the payment transaction from the
	 * account owner, or other authorised party, and processes the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFirstAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that receives the payment instruction from the originator and
	 * forwards it to the first agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives the payment instruction from the originator and forwards it to the first agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmForwardingAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardingAgent";
			definition = "Party that receives the payment instruction from the originator and forwards it to the first agent in the payment chain.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that receives an amount of money from the debtor. In the context of
	 * the payment model, the creditor is also the credit account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCreditor = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that owes an amount of money to the creditor. In the context of the
	 * payment model, the debtor is also the debit account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the creditor. In the context of the payment model, the debtor is also the debit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmDebtor = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the creditor. In the context of the payment model, the debtor is also the debit account owner.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is the ultimate beneficiary of the credit transfer. The final
	 * party is mentioned when different from the creditor, whose account will
	 * be credited by the final agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the ultimate beneficiary of the credit transfer. The final party is mentioned when different from the creditor, whose account will be credited by the final agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFinalParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalParty";
			definition = "Party that is the ultimate beneficiary of the credit transfer. The final party is mentioned when different from the creditor, whose account will be credited by the final agent.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that owes an amount of money to the creditor, eg, for the receipt
	 * of goods and services. This party orders the payment, and may or may not
	 * be the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the creditor, eg, for the receipt of goods and services. This party orders the payment, and may or may not be the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmOriginatingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginatingParty";
			definition = "Party that owes an amount of money to the creditor, eg, for the receipt of goods and services. This party orders the payment, and may or may not be the debtor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party appointed by the Fund Management Company. It updates records of
	 * investor accounts to reflect the daily investor purchases, redemptions,
	 * switches, transfers, and re-registrations. It ensures the timely
	 * settlement of transactions, and may provide tax information to the
	 * investor and/or to its intermediaries. It may calculate, collect, and
	 * rebate commissions. It prepares and distributes confirmations reflecting
	 * transactions, resulting in unit or cash account movements to the investor
	 * or the investor's intermediary. It responds to inquiries concerning
	 * account status, and processes the income distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed by the Fund Management Company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTransferAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAgent";
			definition = "Party appointed by the Fund Management Company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that provides services to investors relating to financial products.
	 * These services may include some, or all of, provision of information and
	 * advice on products, placement of investment orders, transmission of
	 * payment, custody of assets, and the administration of rights and
	 * benefits. In the specific framework of investment funds industry, an
	 * intermediary may present information about Funds to potential investors,
	 * and solicit orders for the Fund. It may facilitate the transmission of
	 * the orders and information from/to the investors and/or other
	 * intermediaries. The intermediary receives commission from the Fund and/or
	 * fees from the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about Funds to potential investors, and solicit orders for the Fund. It may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmIntermediary = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about Funds to potential investors, and solicit orders for the Fund. It may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that safekeeps and administers assets on behalf of the owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that safekeeps and administers assets on behalf of the owner."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCustodian = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Custodian";
			definition = "Party that safekeeps and administers assets on behalf of the owner.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Agent that executes the payment. In the context of the Funds industry,
	 * the paying agent is the legal representative of the Fund locally. It may
	 * pay out dividends, and collects money for the purchase of funds when a
	 * client deals directly with the Fund and/or when a client deals with
	 * bearer shares. It pays out the redemption of the Fund, may distribute
	 * information about the fund, and provides legal information about the
	 * Fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that executes the payment.  In the context of the Funds industry, the paying agent is the legal representative of the Fund locally. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the Fund and/or when a client deals with bearer shares. It pays out the redemption of the Fund, may distribute information about the fund, and provides legal information about the Fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmPayingAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayingAgent";
			definition = "Agent that executes the payment.  In the context of the Funds industry, the paying agent is the legal representative of the Fund locally. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the Fund and/or when a client deals with bearer shares. It pays out the redemption of the Fund, may distribute information about the fund, and provides legal information about the Fund.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that keeps accounting records of the available assets and
	 * liabilities of the Fund. It calculates dealing prices, the Net Asset
	 * Value (NAV) of the Fund, and may provide fund performance and tax data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundAccountant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that keeps accounting records of the available assets and liabilities of the Fund. It calculates dealing prices, the Net Asset Value (NAV) of the Fund, and may provide fund performance and tax data."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFundAccountant = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundAccountant";
			definition = "Party that keeps accounting records of the available assets and liabilities of the Fund. It calculates dealing prices, the Net Asset Value (NAV) of the Fund, and may provide fund performance and tax data.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that implements the investment strategy, ie, selects portfolio
	 * investments in accordance with the objectives and strategy in the fund's
	 * prospectus, and places orders to effect or liquidate selected investments
	 * in accordance with net flow of capital into or out of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that implements the investment strategy, ie, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvestmentManager = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentManager";
			definition = "Party that implements the investment strategy, ie, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that sets up the Fund, decides the investment strategy, appoints
	 * the agents, and is responsible for the promotion and the marketing of the
	 * Fund. It makes all of the important decisions related to the Fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sets up the Fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the Fund. It makes all of the important decisions related to the Fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFundManagementCompany = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundManagementCompany";
			definition = "Party that sets up the Fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the Fund. It makes all of the important decisions related to the Fund.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is responsible for keeping track of the owners of securities.
	 * In the context of Funds, the party appointed by the Fund Management
	 * Company that keeps the investor registry of the Fund, and administers
	 * investor accounts and related records. These records represent the
	 * liability accounts of the Fund Management Company. It prepares and
	 * distributes account statements (holdings and transactions) to the
	 * investor and/or its intermediary, on a periodical or upon request basis.
	 * It may provide tax information to the investor and/or to its
	 * intermediary, can be the corporate secretary for the proxy voting,
	 * reports to the regulator on shareholder identity, and can appoint the
	 * sub-registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is responsible for keeping track of the owners of securities. In the context of Funds, the party appointed by the Fund Management Company that keeps the investor registry of the Fund, and administers investor accounts and related records. These records represent the liability accounts of the Fund Management Company. It prepares and distributes account statements (holdings and transactions) to the investor and/or its intermediary, on a periodical or upon request basis. It may provide tax information to the investor and/or to its intermediary, can be the corporate secretary for the proxy voting, reports to the regulator on shareholder identity, and can appoint the sub-registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmRegistrar = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registrar";
			definition = "Party that is responsible for keeping track of the owners of securities. In the context of Funds, the party appointed by the Fund Management Company that keeps the investor registry of the Fund, and administers investor accounts and related records. These records represent the liability accounts of the Fund Management Company. It prepares and distributes account statements (holdings and transactions) to the investor and/or its intermediary, on a periodical or upon request basis. It may provide tax information to the investor and/or to its intermediary, can be the corporate secretary for the proxy voting, reports to the regulator on shareholder identity, and can appoint the sub-registrar.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Financial institution that executes cash transfers on behalf of its
	 * clients.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that executes cash transfers on behalf of its clients."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCashCorrespondent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashCorrespondent";
			definition = "Financial institution that executes cash transfers on behalf of its clients.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is a source of financial information. It provides financial
	 * news and data (for example, facts, statistics and analysis), for
	 * professional and individual investors through various media (for example,
	 * the Internet, magazines).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is a source of financial information. It provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media (for example, the Internet, magazines)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmDataProvider = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataProvider";
			definition = "Party that is a source of financial information. It provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media (for example, the Internet, magazines).";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which settles a deal through its own accounts without being party
	 * to that deal, for example, custodians, settlement systems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasurySettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which settles a deal through its own accounts without being party to that deal, for example, custodians, settlement systems."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmTreasurySettlementParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasurySettlementParty";
			definition = "Party which settles a deal through its own accounts without being party to that deal, for example, custodians, settlement systems.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Individual or institution, that purchases or sells financial instruments,
	 * for its own account, or on behalf of an investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual or institution, that purchases or sells financial instruments, for its own account, or on behalf of an investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmBuySideParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideParty";
			definition = "Individual or institution, that purchases or sells financial instruments, for its own account, or on behalf of an investor.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Institution that receives and redistributes certain business information,
	 * for example, quote or order details, or facilitating trading. It may add
	 * or modify the information if necessary. Examples include: alternative
	 * trading systems (ATS)- mechanisms whereby the direct trading of stocks
	 * can occur without the presence of brokers or other intermediaries), or
	 * Electronic Communications Networks (ECN)-electronic stock markets
	 * anonymously matching buy and sell orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedistributorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution that receives and redistributes certain business information, for example, quote or order details, or facilitating trading. It may add or modify the information if necessary. Examples include: alternative trading systems (ATS)- mechanisms whereby the direct trading of stocks can occur without the presence of brokers or other intermediaries), or Electronic Communications Networks (ECN)-electronic stock markets anonymously matching buy and sell orders."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmRedistributorAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedistributorAgent";
			definition = "Institution that receives and redistributes certain business information, for example, quote or order details, or facilitating trading. It may add or modify the information if necessary. Examples include: alternative trading systems (ATS)- mechanisms whereby the direct trading of stocks can occur without the presence of brokers or other intermediaries), or Electronic Communications Networks (ECN)-electronic stock markets anonymously matching buy and sell orders.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Broker that sells its services (for example, research, analysis and
	 * recommendation), to buy-side parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker that sells its services (for example, research, analysis and recommendation), to buy-side parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSellSideParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideParty";
			definition = "Broker that sells its services (for example, research, analysis and recommendation), to buy-side parties.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party identified in a commercial invoice as the liable party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identified in a commercial invoice as the liable party."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvoicee = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoicee";
			definition = "Party identified in a commercial invoice as the liable party.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party identified as the issuer of an invoice on the face of a commercial
	 * invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identified as the issuer of an invoice on the face of a commercial invoice."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvoicer = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoicer";
			definition = "Party identified as the issuer of an invoice on the face of a commercial invoice.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmAccountOwner = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that manages the account on behalf of the account owner, ie,
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, ie, manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmAccountServicer = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, ie, manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which is assigned an investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaseAssignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is assigned an investigation case."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCaseAssignee = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaseAssignee";
			definition = "Party which is assigned an investigation case.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party assigning an investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaseAssigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party assigning an investigation case."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCaseAssigner = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaseAssigner";
			definition = "Party assigning an investigation case.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party involved in investigations management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party involved in investigations management."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvestigationManager = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationManager";
			definition = "Party involved in investigations management.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that forwards meeting information and meeting results to the
	 * Investor, checks position with the Custodian and collects voting
	 * instructions from the Investor and forwards to the next.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Facilitator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that forwards meeting information and meeting results to the Investor, checks position with the Custodian and collects voting instructions from the Investor and forwards to the next."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFacilitator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Facilitator";
			definition = "Party that forwards meeting information and meeting results to the Investor, checks position with the Custodian and collects voting instructions from the Investor and forwards to the next.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that is responsible for making meeting information available to the
	 * market, collecting the votes and publishing the meeting results.<br>
	 * This party can delegate to a registrar, transfer agent or a bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyVotingInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is responsible for making meeting information available to the market, collecting the votes and publishing the meeting results.\r\nThis party can delegate to a registrar, transfer agent or a bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmProxyVotingInitiator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyVotingInitiator";
			definition = "Party that is responsible for making meeting information available to the market, collecting the votes and publishing the meeting results.\r\nThis party can delegate to a registrar, transfer agent or a bank.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Intermediary in the Proxy voting chain that forwards and makes
	 * information available that was received/collected from the Proxy
	 * Initiator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyInformationProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Intermediary in the Proxy voting chain that forwards and makes information available that was received/collected from the Proxy Initiator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmProxyInformationProvider = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyInformationProvider";
			definition = "Intermediary in the Proxy voting chain that forwards and makes information available that was received/collected from the Proxy Initiator.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that provides custody services for shares affected by proxy voting,
	 * that is, share blocking and unblocking, share registration, position
	 * keeping, securities lending services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyServiceProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides custody services for shares affected by proxy voting, that is, share blocking and unblocking, share registration, position keeping, securities lending services."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCustodyServiceProvider = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyServiceProvider";
			definition = "Party that provides custody services for shares affected by proxy voting, that is, share blocking and unblocking, share registration, position keeping, securities lending services.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Intermediary in the proxy voting chain that is active in the same market
	 * as where the shares are safekept. Collects and receives meeting
	 * information from the initiator and/or the proxy information provider and
	 * forwards it to the facilitator and/or investor. Collects voting
	 * instructions from the faciliatator and/or investor and forwards them to
	 * the initiator. May verify the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarketIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Intermediary in the proxy voting chain that is active in the same market as where the shares are safekept. Collects and receives meeting information from the initiator and/or the proxy information provider and forwards it to the facilitator and/or investor. Collects voting instructions from the faciliatator and/or investor and forwards them to the initiator. May verify the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmLocalMarketIntermediary = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketIntermediary";
			definition = "Intermediary in the proxy voting chain that is active in the same market as where the shares are safekept. Collects and receives meeting information from the initiator and/or the proxy information provider and forwards it to the facilitator and/or investor. Collects voting instructions from the faciliatator and/or investor and forwards them to the initiator. May verify the entitlement.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party that issues voting instructions instructions. It can be:<br>
	 * <br>
	 * - Beneficial Owner (the effective owner of the shares)<br>
	 * - Investment Manager<br>
	 * - Proxy Agency
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that issues voting instructions instructions. It can be:\r\n\r\n- Beneficial Owner (the effective owner of the shares)\r\n- Investment Manager\r\n- Proxy Agency"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmVotingParty = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingParty";
			definition = "Party that issues voting instructions instructions. It can be:\r\n\r\n- Beneficial Owner (the effective owner of the shares)\r\n- Investment Manager\r\n- Proxy Agency";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party, physical person or legal entity that starts or follows-up an
	 * investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investigator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, physical person or legal entity that starts or follows-up an investigation case."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInvestigator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investigator";
			definition = "Party, physical person or legal entity that starts or follows-up an investigation case.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party, physical person or legal entity that starts or follows-up an
	 * investigation case within a corporate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInvestigator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, physical person or legal entity that starts or follows-up an investigation case within a corporate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCorporateInvestigator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInvestigator";
			definition = "Party, physical person or legal entity that starts or follows-up an investigation case within a corporate.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party, physical person or legal entity that starts or follows-up an
	 * investigation case within a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInvestigator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, physical person or legal entity that starts or follows-up an investigation case within a financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFinancialInvestigator = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInvestigator";
			definition = "Party, physical person or legal entity that starts or follows-up an investigation case within a financial institution.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * System which provides cash settlement for trades submitted by its
	 * members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System which provides cash settlement for trades submitted by its members."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCentralSettlementSystem = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralSettlementSystem";
			definition = "System which provides cash settlement for trades submitted by its members.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which is member of a cash settlement system and which submits
	 * trades to be settled between members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which is member of a cash settlement system and which submits trades to be settled between members."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSettlementMember = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMember";
			definition = "Party which is member of a cash settlement system and which submits trades to be settled between members.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Organisation that is legally responsible for reporting securities trade
	 * transactions to a regulator or a competent authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation that is legally responsible for reporting securities trade transactions to a regulator or a competent authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmReportingInstitution = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Organisation that is legally responsible for reporting securities trade transactions to a regulator or a competent authority.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Messaging application used by a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitutionApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Messaging application used by a financial institution."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmFinancialInstitutionApplication = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitutionApplication";
			definition = "Messaging application used by a financial institution.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFinancialInstitutionApplication"</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmNonFinancialInstitutionApplication = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFinancialInstitutionApplication";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemApplication"</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmSystemApplication = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemApplication";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Account holder in a Central Securities Depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account holder in a Central Securities Depository."</li>
	 * </ul>
	 */
	public static final MMBusinessRole mmCSDParticipant = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSDParticipant";
			definition = "Account holder in a Central Securities Depository.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Party which holds and administers securities for example, Eurobonds or
	 * other financial assets, holds issuance accounts and enables transactions
	 * to be processed by book entry. An ICSD also settles trades in
	 * international securities and in various domestic securities, usually
	 * through direct or indirect (through local agents) links to local CSDs.
	 * Assets may exist either physically (but immobilized within the CSD) or in
	 * a dematerialised form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalCentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which holds and administers securities for example, Eurobonds or other financial assets, holds issuance accounts and enables transactions to be processed by book entry. An  ICSD also settles trades in international securities and in various domestic securities, usually through direct or indirect (through local agents) links to local CSDs. Assets may exist either physically (but immobilized within the CSD) or in a dematerialised form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmInternationalCentralSecuritiesDepository = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InternationalCentralSecuritiesDepository";
			definition = "Party which holds and administers securities for example, Eurobonds or other financial assets, holds issuance accounts and enables transactions to be processed by book entry. An  ICSD also settles trades in international securities and in various domestic securities, usually through direct or indirect (through local agents) links to local CSDs. Assets may exist either physically (but immobilized within the CSD) or in a dematerialised form.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Entity which is obligated on a security or other financial instrument.
	 * For example, a corporation or government having the authority to issue
	 * and sell a security, or a bank that approves a letter of credit. Issuer
	 * is sometimes used to refer to a financial institution that issues credit
	 * or debit cards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity which is obligated on a security or other financial instrument. For example, a corporation or government having the authority to issue and sell a security, or a bank that approves a letter of credit. Issuer is sometimes used to refer to a financial institution that issues credit or debit cards."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmIssuer = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuer";
			definition = "Entity which is obligated on a security or other financial instrument. For example, a corporation or government having the authority to issue and sell a security, or a bank that approves a letter of credit. Issuer is sometimes used to refer to a financial institution that issues credit or debit cards.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Organisation appointed by the issuer for the purposes of administration
	 * of a security issue or processing of a corporate action or a meeting
	 * event. In some cases, the issuer acts as its own agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation appointed by the issuer for the purposes of administration of a security issue or processing of a corporate action or a meeting event. In some cases, the issuer acts as its own agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmIssuerAgent = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerAgent";
			definition = "Organisation appointed by the issuer for the purposes of administration of a security issue or processing of a corporate action or a meeting event. In some cases, the issuer acts as its own agent.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Principal monetary authority of a nation, a central bank performs several
	 * key functions, including issuing currency and regulating the supply of
	 * credit in the economy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalCentralBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal monetary authority of a nation, a central bank performs several key functions, including issuing currency and regulating the supply of credit in the economy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmNationalCentralBank = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalCentralBank";
			definition = "Principal monetary authority of a nation, a central bank performs several key functions, including issuing currency and regulating the supply of credit in the economy.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};
	/**
	 * Corporation or mutual organization which provides the facilities for
	 * stock brokers to trade company stocks and other financial instruments in
	 * the secondary market. Stock exchanges also provide facilities for the
	 * issue and redemption of securities, as well as other financial
	 * instruments and capital events including the payment of income and
	 * dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessRole#getBusinessProcess
	 * businessProcess} =
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporation or mutual organization which provides the facilities for stock brokers to trade company stocks and other financial instruments in the secondary market. Stock exchanges also provide facilities for the issue and redemption of securities, as well as other financial instruments and capital events including the payment of income and dividends."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessRole mmStockExchange = new MMBusinessRole() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Corporation or mutual organization which provides the facilities for stock brokers to trade company stocks and other financial instruments in the secondary market. Stock exchanges also provide facilities for the issue and redemption of securities, as well as other financial instruments and capital events including the payment of income and dividends.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};

	final static public MMBusinessProcess mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessProcess() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BUSINESSPROCESS_FOR_ROLES";
				businessRole_lazy = () -> Arrays.asList(com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmOrderGiver, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTrustee,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmAffirmingParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmExecutingBroker,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInstitutionalInvestor, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmPrimeBroker,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmUnderwriter, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCentralMatchingUtility,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmNonClearingMember, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmClearingMember,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmMasterTerminalManager, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTerminalManager,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmBuyer, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmBuyersBank, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSeller,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSellersBank, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmAcquirer,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCardAcceptor, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCardholder, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmMerchant,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCreditorAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCreditorSendingParty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmDebtorAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmDebtorReceivingParty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCollateralGiver, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCollateralTaker,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCAAccountServicer, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCAAccountOwner,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSettlementAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmGlobalSettlementAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmLocalSettlementAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInterestedAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmRegulator, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvestor, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmMarketMaker,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTradingParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvestmentDecisionMaker,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTradeInstructor, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmPostTradeAdministrator,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTrader, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInfrastructure,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmConfirmationParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCentralCounterparty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCentralSecuritiesDepository, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSystemTransactionAdministrator,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmThirdParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSystemMember,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSystemDirectMember, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSystemIndirectMember,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmAgreementParty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInitiatingParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmDebitParty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCreditParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmPaymentClearingAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmPaymentSettlementAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFinalAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFirstAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmForwardingAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCreditor, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmDebtor, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFinalParty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmOriginatingParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTransferAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmIntermediary, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCustodian,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmPayingAgent, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFundAccountant,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvestmentManager, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFundManagementCompany,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmRegistrar, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCashCorrespondent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmDataProvider, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmTreasurySettlementParty,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmBuySideParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmRedistributorAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSellSideParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvoicee, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvoicer,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmAccountOwner, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmAccountServicer,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCaseAssignee, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCaseAssigner,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvestigationManager, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFacilitator,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmProxyVotingInitiator, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmProxyInformationProvider,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCustodyServiceProvider, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmLocalMarketIntermediary,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmVotingParty, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInvestigator,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCorporateInvestigator, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFinancialInvestigator,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCentralSettlementSystem, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSettlementMember,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmReportingInstitution, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmFinancialInstitutionApplication,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmNonFinancialInstitutionApplication, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmSystemApplication,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmCSDParticipant, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmInternationalCentralSecuritiesDepository,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmIssuer, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmIssuerAgent,
						com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmNationalCentralBank, com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES.mmStockExchange);
			}
		});
		return mmObject_lazy.get();
	}
}