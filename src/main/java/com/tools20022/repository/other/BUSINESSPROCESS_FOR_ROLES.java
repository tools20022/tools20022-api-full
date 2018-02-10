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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#OrderGiver
 * BUSINESSPROCESS_FOR_ROLES.OrderGiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Trustee
 * BUSINESSPROCESS_FOR_ROLES.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#AffirmingParty
 * BUSINESSPROCESS_FOR_ROLES.AffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ExecutingBroker
 * BUSINESSPROCESS_FOR_ROLES.ExecutingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InstitutionalInvestor
 * BUSINESSPROCESS_FOR_ROLES.InstitutionalInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#PrimeBroker
 * BUSINESSPROCESS_FOR_ROLES.PrimeBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Underwriter
 * BUSINESSPROCESS_FOR_ROLES.Underwriter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CentralMatchingUtility
 * BUSINESSPROCESS_FOR_ROLES.CentralMatchingUtility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#NonClearingMember
 * BUSINESSPROCESS_FOR_ROLES.NonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ClearingMember
 * BUSINESSPROCESS_FOR_ROLES.ClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#MasterTerminalManager
 * BUSINESSPROCESS_FOR_ROLES.MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#TerminalManager
 * BUSINESSPROCESS_FOR_ROLES.TerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Buyer
 * BUSINESSPROCESS_FOR_ROLES.Buyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#BuyersBank
 * BUSINESSPROCESS_FOR_ROLES.BuyersBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Seller
 * BUSINESSPROCESS_FOR_ROLES.Seller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SellersBank
 * BUSINESSPROCESS_FOR_ROLES.SellersBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Acquirer
 * BUSINESSPROCESS_FOR_ROLES.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CardAcceptor
 * BUSINESSPROCESS_FOR_ROLES.CardAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Cardholder
 * BUSINESSPROCESS_FOR_ROLES.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Merchant
 * BUSINESSPROCESS_FOR_ROLES.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CreditorAgent
 * BUSINESSPROCESS_FOR_ROLES.CreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CreditorSendingParty
 * BUSINESSPROCESS_FOR_ROLES.CreditorSendingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#DebtorAgent
 * BUSINESSPROCESS_FOR_ROLES.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#DebtorReceivingParty
 * BUSINESSPROCESS_FOR_ROLES.DebtorReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CollateralGiver
 * BUSINESSPROCESS_FOR_ROLES.CollateralGiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CollateralTaker
 * BUSINESSPROCESS_FOR_ROLES.CollateralTaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CAAccountServicer
 * BUSINESSPROCESS_FOR_ROLES.CAAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CAAccountOwner
 * BUSINESSPROCESS_FOR_ROLES.CAAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.SettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#GlobalSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.GlobalSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#LocalSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.LocalSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InterestedAgent
 * BUSINESSPROCESS_FOR_ROLES.InterestedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Regulator
 * BUSINESSPROCESS_FOR_ROLES.Regulator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Investor
 * BUSINESSPROCESS_FOR_ROLES.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#MarketMaker
 * BUSINESSPROCESS_FOR_ROLES.MarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#TradingParty
 * BUSINESSPROCESS_FOR_ROLES.TradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InvestmentDecisionMaker
 * BUSINESSPROCESS_FOR_ROLES.InvestmentDecisionMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#TradeInstructor
 * BUSINESSPROCESS_FOR_ROLES.TradeInstructor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#PostTradeAdministrator
 * BUSINESSPROCESS_FOR_ROLES.PostTradeAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Trader
 * BUSINESSPROCESS_FOR_ROLES.Trader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Infrastructure
 * BUSINESSPROCESS_FOR_ROLES.Infrastructure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ConfirmationParty
 * BUSINESSPROCESS_FOR_ROLES.ConfirmationParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CentralCounterparty
 * BUSINESSPROCESS_FOR_ROLES.CentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CentralSecuritiesDepository
 * BUSINESSPROCESS_FOR_ROLES.CentralSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SystemTransactionAdministrator
 * BUSINESSPROCESS_FOR_ROLES.SystemTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ThirdParty
 * BUSINESSPROCESS_FOR_ROLES.ThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SystemMember
 * BUSINESSPROCESS_FOR_ROLES.SystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SystemDirectMember
 * BUSINESSPROCESS_FOR_ROLES.SystemDirectMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SystemIndirectMember
 * BUSINESSPROCESS_FOR_ROLES.SystemIndirectMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Agent
 * BUSINESSPROCESS_FOR_ROLES.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#AgreementParty
 * BUSINESSPROCESS_FOR_ROLES.AgreementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InitiatingParty
 * BUSINESSPROCESS_FOR_ROLES.InitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#DebitParty
 * BUSINESSPROCESS_FOR_ROLES.DebitParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CreditParty
 * BUSINESSPROCESS_FOR_ROLES.CreditParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#PaymentClearingAgent
 * BUSINESSPROCESS_FOR_ROLES.PaymentClearingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#PaymentSettlementAgent
 * BUSINESSPROCESS_FOR_ROLES.PaymentSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FinalAgent
 * BUSINESSPROCESS_FOR_ROLES.FinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FirstAgent
 * BUSINESSPROCESS_FOR_ROLES.FirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ForwardingAgent
 * BUSINESSPROCESS_FOR_ROLES.ForwardingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Creditor
 * BUSINESSPROCESS_FOR_ROLES.Creditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Debtor
 * BUSINESSPROCESS_FOR_ROLES.Debtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FinalParty
 * BUSINESSPROCESS_FOR_ROLES.FinalParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#OriginatingParty
 * BUSINESSPROCESS_FOR_ROLES.OriginatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#TransferAgent
 * BUSINESSPROCESS_FOR_ROLES.TransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Intermediary
 * BUSINESSPROCESS_FOR_ROLES.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Custodian
 * BUSINESSPROCESS_FOR_ROLES.Custodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#PayingAgent
 * BUSINESSPROCESS_FOR_ROLES.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FundAccountant
 * BUSINESSPROCESS_FOR_ROLES.FundAccountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InvestmentManager
 * BUSINESSPROCESS_FOR_ROLES.InvestmentManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FundManagementCompany
 * BUSINESSPROCESS_FOR_ROLES.FundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Registrar
 * BUSINESSPROCESS_FOR_ROLES.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CashCorrespondent
 * BUSINESSPROCESS_FOR_ROLES.CashCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#DataProvider
 * BUSINESSPROCESS_FOR_ROLES.DataProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#TreasurySettlementParty
 * BUSINESSPROCESS_FOR_ROLES.TreasurySettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#BuySideParty
 * BUSINESSPROCESS_FOR_ROLES.BuySideParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#RedistributorAgent
 * BUSINESSPROCESS_FOR_ROLES.RedistributorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SellSideParty
 * BUSINESSPROCESS_FOR_ROLES.SellSideParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Invoicee
 * BUSINESSPROCESS_FOR_ROLES.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Invoicer
 * BUSINESSPROCESS_FOR_ROLES.Invoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#AccountOwner
 * BUSINESSPROCESS_FOR_ROLES.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#AccountServicer
 * BUSINESSPROCESS_FOR_ROLES.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CaseAssignee
 * BUSINESSPROCESS_FOR_ROLES.CaseAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CaseAssigner
 * BUSINESSPROCESS_FOR_ROLES.CaseAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InvestigationManager
 * BUSINESSPROCESS_FOR_ROLES.InvestigationManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Facilitator
 * BUSINESSPROCESS_FOR_ROLES.Facilitator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ProxyVotingInitiator
 * BUSINESSPROCESS_FOR_ROLES.ProxyVotingInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ProxyInformationProvider
 * BUSINESSPROCESS_FOR_ROLES.ProxyInformationProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CustodyServiceProvider
 * BUSINESSPROCESS_FOR_ROLES.CustodyServiceProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#LocalMarketIntermediary
 * BUSINESSPROCESS_FOR_ROLES.LocalMarketIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#VotingParty
 * BUSINESSPROCESS_FOR_ROLES.VotingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Investigator
 * BUSINESSPROCESS_FOR_ROLES.Investigator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CorporateInvestigator
 * BUSINESSPROCESS_FOR_ROLES.CorporateInvestigator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FinancialInvestigator
 * BUSINESSPROCESS_FOR_ROLES.FinancialInvestigator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CentralSettlementSystem
 * BUSINESSPROCESS_FOR_ROLES.CentralSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SettlementMember
 * BUSINESSPROCESS_FOR_ROLES.SettlementMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#ReportingInstitution
 * BUSINESSPROCESS_FOR_ROLES.ReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#FinancialInstitutionApplication
 * BUSINESSPROCESS_FOR_ROLES.FinancialInstitutionApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#NonFinancialInstitutionApplication
 * BUSINESSPROCESS_FOR_ROLES.NonFinancialInstitutionApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#SystemApplication
 * BUSINESSPROCESS_FOR_ROLES.SystemApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#CSDParticipant
 * BUSINESSPROCESS_FOR_ROLES.CSDParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#InternationalCentralSecuritiesDepository
 * BUSINESSPROCESS_FOR_ROLES.InternationalCentralSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#Issuer
 * BUSINESSPROCESS_FOR_ROLES.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#IssuerAgent
 * BUSINESSPROCESS_FOR_ROLES.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#NationalCentralBank
 * BUSINESSPROCESS_FOR_ROLES.NationalCentralBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES#StockExchange
 * BUSINESSPROCESS_FOR_ROLES.StockExchange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
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
	public static final MMBusinessRole OrderGiver = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole Trustee = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole AffirmingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole ExecutingBroker = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole InstitutionalInvestor = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole PrimeBroker = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole Underwriter = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CentralMatchingUtility = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole NonClearingMember = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole ClearingMember = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole MasterTerminalManager = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole TerminalManager = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Buyer = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole BuyersBank = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole Seller = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole SellersBank = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole Acquirer = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CardAcceptor = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Cardholder = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Merchant = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CreditorAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CreditorSendingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole DebtorAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole DebtorReceivingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CollateralGiver = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CollateralTaker = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CAAccountServicer = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CAAccountOwner = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole GlobalSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole LocalSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole InterestedAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Regulator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Investor = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole MarketMaker = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole TradingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole InvestmentDecisionMaker = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole TradeInstructor = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole PostTradeAdministrator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Trader = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Infrastructure = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole ConfirmationParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=BUSINESSCOMMENT, comment=Controls the Custody
	 * activities for one market., type=ADMINCOMMENT, comment=Controls the
	 * Custody activities for one market.</li>
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
	public static final MMBusinessRole CentralCounterparty = new MMBusinessRole() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BUSINESSCOMMENT", new String[]{"comment", "Controls the Custody activities for one market."}), new OtherSemanticMarkup(this, "ADMINCOMMENT", new String[]{
					"comment", "Controls the Custody activities for one market."}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CentralSecuritiesDepository = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SystemTransactionAdministrator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole ThirdParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SystemMember = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SystemDirectMember = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SystemIndirectMember = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Agent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole AgreementParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole InitiatingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole DebitParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CreditParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole PaymentClearingAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole PaymentSettlementAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole FinalAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole FirstAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole ForwardingAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Creditor = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Debtor = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole FinalParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole OriginatingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole TransferAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Intermediary = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Custodian = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole PayingAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole FundAccountant = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole InvestmentManager = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole FundManagementCompany = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Registrar = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CashCorrespondent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole DataProvider = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole TreasurySettlementParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole BuySideParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole RedistributorAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SellSideParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Invoicee = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Invoicer = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole AccountOwner = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole AccountServicer = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CaseAssignee = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole CaseAssigner = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole InvestigationManager = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Facilitator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole ProxyVotingInitiator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole ProxyInformationProvider = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CustodyServiceProvider = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole LocalMarketIntermediary = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole VotingParty = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole Investigator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CorporateInvestigator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole FinancialInvestigator = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CentralSettlementSystem = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole SettlementMember = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole ReportingInstitution = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole FinancialInstitutionApplication = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole NonFinancialInstitutionApplication = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole SystemApplication = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMBusinessRole CSDParticipant = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole InternationalCentralSecuritiesDepository = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole Issuer = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole IssuerAgent = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole NationalCentralBank = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMBusinessRole StockExchange = new MMBusinessRole() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Corporation or mutual organization which provides the facilities for stock brokers to trade company stocks and other financial instruments in the secondary market. Stock exchanges also provide facilities for the issue and redemption of securities, as well as other financial instruments and capital events including the payment of income and dividends.";
			businessProcess_lazy = () -> BUSINESSPROCESS_FOR_ROLES.mmObject();
		}
	};

	final static public MMBusinessProcess mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessProcess() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BUSINESSPROCESS_FOR_ROLES";
				businessRole_lazy = () -> Arrays.asList(BUSINESSPROCESS_FOR_ROLES.OrderGiver, BUSINESSPROCESS_FOR_ROLES.Trustee, BUSINESSPROCESS_FOR_ROLES.AffirmingParty, BUSINESSPROCESS_FOR_ROLES.ExecutingBroker,
						BUSINESSPROCESS_FOR_ROLES.InstitutionalInvestor, BUSINESSPROCESS_FOR_ROLES.PrimeBroker, BUSINESSPROCESS_FOR_ROLES.Underwriter, BUSINESSPROCESS_FOR_ROLES.CentralMatchingUtility,
						BUSINESSPROCESS_FOR_ROLES.NonClearingMember, BUSINESSPROCESS_FOR_ROLES.ClearingMember, BUSINESSPROCESS_FOR_ROLES.MasterTerminalManager, BUSINESSPROCESS_FOR_ROLES.TerminalManager, BUSINESSPROCESS_FOR_ROLES.Buyer,
						BUSINESSPROCESS_FOR_ROLES.BuyersBank, BUSINESSPROCESS_FOR_ROLES.Seller, BUSINESSPROCESS_FOR_ROLES.SellersBank, BUSINESSPROCESS_FOR_ROLES.Acquirer, BUSINESSPROCESS_FOR_ROLES.CardAcceptor,
						BUSINESSPROCESS_FOR_ROLES.Cardholder, BUSINESSPROCESS_FOR_ROLES.Merchant, BUSINESSPROCESS_FOR_ROLES.CreditorAgent, BUSINESSPROCESS_FOR_ROLES.CreditorSendingParty, BUSINESSPROCESS_FOR_ROLES.DebtorAgent,
						BUSINESSPROCESS_FOR_ROLES.DebtorReceivingParty, BUSINESSPROCESS_FOR_ROLES.CollateralGiver, BUSINESSPROCESS_FOR_ROLES.CollateralTaker, BUSINESSPROCESS_FOR_ROLES.CAAccountServicer,
						BUSINESSPROCESS_FOR_ROLES.CAAccountOwner, BUSINESSPROCESS_FOR_ROLES.SettlementAgent, BUSINESSPROCESS_FOR_ROLES.GlobalSettlementAgent, BUSINESSPROCESS_FOR_ROLES.LocalSettlementAgent,
						BUSINESSPROCESS_FOR_ROLES.InterestedAgent, BUSINESSPROCESS_FOR_ROLES.Regulator, BUSINESSPROCESS_FOR_ROLES.Investor, BUSINESSPROCESS_FOR_ROLES.MarketMaker, BUSINESSPROCESS_FOR_ROLES.TradingParty,
						BUSINESSPROCESS_FOR_ROLES.InvestmentDecisionMaker, BUSINESSPROCESS_FOR_ROLES.TradeInstructor, BUSINESSPROCESS_FOR_ROLES.PostTradeAdministrator, BUSINESSPROCESS_FOR_ROLES.Trader,
						BUSINESSPROCESS_FOR_ROLES.Infrastructure, BUSINESSPROCESS_FOR_ROLES.ConfirmationParty, BUSINESSPROCESS_FOR_ROLES.CentralCounterparty, BUSINESSPROCESS_FOR_ROLES.CentralSecuritiesDepository,
						BUSINESSPROCESS_FOR_ROLES.SystemTransactionAdministrator, BUSINESSPROCESS_FOR_ROLES.ThirdParty, BUSINESSPROCESS_FOR_ROLES.SystemMember, BUSINESSPROCESS_FOR_ROLES.SystemDirectMember,
						BUSINESSPROCESS_FOR_ROLES.SystemIndirectMember, BUSINESSPROCESS_FOR_ROLES.Agent, BUSINESSPROCESS_FOR_ROLES.AgreementParty, BUSINESSPROCESS_FOR_ROLES.InitiatingParty, BUSINESSPROCESS_FOR_ROLES.DebitParty,
						BUSINESSPROCESS_FOR_ROLES.CreditParty, BUSINESSPROCESS_FOR_ROLES.PaymentClearingAgent, BUSINESSPROCESS_FOR_ROLES.PaymentSettlementAgent, BUSINESSPROCESS_FOR_ROLES.FinalAgent, BUSINESSPROCESS_FOR_ROLES.FirstAgent,
						BUSINESSPROCESS_FOR_ROLES.ForwardingAgent, BUSINESSPROCESS_FOR_ROLES.Creditor, BUSINESSPROCESS_FOR_ROLES.Debtor, BUSINESSPROCESS_FOR_ROLES.FinalParty, BUSINESSPROCESS_FOR_ROLES.OriginatingParty,
						BUSINESSPROCESS_FOR_ROLES.TransferAgent, BUSINESSPROCESS_FOR_ROLES.Intermediary, BUSINESSPROCESS_FOR_ROLES.Custodian, BUSINESSPROCESS_FOR_ROLES.PayingAgent, BUSINESSPROCESS_FOR_ROLES.FundAccountant,
						BUSINESSPROCESS_FOR_ROLES.InvestmentManager, BUSINESSPROCESS_FOR_ROLES.FundManagementCompany, BUSINESSPROCESS_FOR_ROLES.Registrar, BUSINESSPROCESS_FOR_ROLES.CashCorrespondent, BUSINESSPROCESS_FOR_ROLES.DataProvider,
						BUSINESSPROCESS_FOR_ROLES.TreasurySettlementParty, BUSINESSPROCESS_FOR_ROLES.BuySideParty, BUSINESSPROCESS_FOR_ROLES.RedistributorAgent, BUSINESSPROCESS_FOR_ROLES.SellSideParty, BUSINESSPROCESS_FOR_ROLES.Invoicee,
						BUSINESSPROCESS_FOR_ROLES.Invoicer, BUSINESSPROCESS_FOR_ROLES.AccountOwner, BUSINESSPROCESS_FOR_ROLES.AccountServicer, BUSINESSPROCESS_FOR_ROLES.CaseAssignee, BUSINESSPROCESS_FOR_ROLES.CaseAssigner,
						BUSINESSPROCESS_FOR_ROLES.InvestigationManager, BUSINESSPROCESS_FOR_ROLES.Facilitator, BUSINESSPROCESS_FOR_ROLES.ProxyVotingInitiator, BUSINESSPROCESS_FOR_ROLES.ProxyInformationProvider,
						BUSINESSPROCESS_FOR_ROLES.CustodyServiceProvider, BUSINESSPROCESS_FOR_ROLES.LocalMarketIntermediary, BUSINESSPROCESS_FOR_ROLES.VotingParty, BUSINESSPROCESS_FOR_ROLES.Investigator,
						BUSINESSPROCESS_FOR_ROLES.CorporateInvestigator, BUSINESSPROCESS_FOR_ROLES.FinancialInvestigator, BUSINESSPROCESS_FOR_ROLES.CentralSettlementSystem, BUSINESSPROCESS_FOR_ROLES.SettlementMember,
						BUSINESSPROCESS_FOR_ROLES.ReportingInstitution, BUSINESSPROCESS_FOR_ROLES.FinancialInstitutionApplication, BUSINESSPROCESS_FOR_ROLES.NonFinancialInstitutionApplication, BUSINESSPROCESS_FOR_ROLES.SystemApplication,
						BUSINESSPROCESS_FOR_ROLES.CSDParticipant, BUSINESSPROCESS_FOR_ROLES.InternationalCentralSecuritiesDepository, BUSINESSPROCESS_FOR_ROLES.Issuer, BUSINESSPROCESS_FOR_ROLES.IssuerAgent,
						BUSINESSPROCESS_FOR_ROLES.NationalCentralBank, BUSINESSPROCESS_FOR_ROLES.StockExchange);
			}
		});
		return mmObject_lazy.get();
	}
}