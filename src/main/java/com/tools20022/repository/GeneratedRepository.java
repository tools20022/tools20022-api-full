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

package com.tools20022.repository;

import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repository.area.*;
import com.tools20022.repository.msgset.*;
import com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 
 <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepository#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepository#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * </ul>
 */
public class GeneratedRepository extends ReflectionBasedRepository {

	final static private AtomicReference<MMRepository> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of BusinessProcessCatalogue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getTopLevelCatalogueEntry
	 * topLevelCatalogueEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CreditorPaymentActivationRequestISOPreviousversion
	 * CreditorPaymentActivationRequestISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CreditorPaymentActivationRequestISOLatestversion
	 * CreditorPaymentActivationRequestISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion
	 * CardPaymentsExchangesTerminalManagementISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion
	 * CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
	 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
	 * InvestmentFundsISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ProxyVotingISOLatestversion
	 * ProxyVotingISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
	 * IssuersAgentsCommunicationISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive
	 * TransactionRegulatoryReportingISOArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOLatestversion
	 * ChangeorVerifyAccountIdentificationISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.BankAccountManagementISOLatestversion
	 * BankAccountManagementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationISOPreviousversion
	 * PaymentsInitiationISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsMandatesISOPreviousversion
	 * PaymentsMandatesISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOPreviousversion
	 * PaymentsClearingandSettlementISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.BanktoCustomerCashManagementISOLatestversion
	 * BanktoCustomerCashManagementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.NotificationtoReceiveISOPreviousversion
	 * NotificationtoReceiveISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion
	 * ExceptionsandInvestigationsISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ForexNotificationsISOArchive
	 * ForexNotificationsISOArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion
	 * InvoiceFinancingRequestISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.FinancialInvoiceISOArchive
	 * FinancialInvoiceISOArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
	 * TradeServicesManagementISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.BanktoCustomerCashManagementISOPreviousversion
	 * BanktoCustomerCashManagementISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion
	 * ChangeorVerifyAccountIdentificationISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion
	 * SettlementAndReconciliationISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOPreviousversion
	 * CorporateActionsISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOLatestversion
	 * ExceptionsandInvestigationsISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationISOLatestversion
	 * PaymentsInitiationISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsMandatesISOLatestversion
	 * PaymentsMandatesISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.NotificationtoReceiveISOLatestversion
	 * NotificationtoReceiveISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion
	 * PaymentsClearingandSettlementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PostTradeMatchingISOPreviousversion
	 * PostTradeMatchingISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.TotalPortfolioValuationReportISOLatestversion
	 * TotalPortfolioValuationReportISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ProxyVotingISOPreviousversion
	 * ProxyVotingISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.AuthoritiesFinancialInvestigationsISOLatestversion
	 * AuthoritiesFinancialInvestigationsISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.BankServicesBillingISOLatestversion
	 * BankServicesBillingISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.BankAccountManagementISOPreviousversion
	 * BankAccountManagementISOPreviousversion}</li>
	 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SSIforSecuritiesPaymentsandForeignExchange
	 * SSIforSecuritiesPaymentsandForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SupplementaryDataISOLatestversion
	 * SupplementaryDataISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
	 * TradeServicesManagementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20132014
	 * CAPEAcceptortoAcquirerMaintenance20132014}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20132014
	 * CAPETerminalManagementMaintenance20132014}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
	 * SettlementAndReconciliationISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOLatestversion
	 * CorporateActionsISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
	 * InvestmentFundsISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PostTradeMatchingISOLatestversion
	 * PostTradeMatchingISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOLatestversion
	 * CardPaymentsExchangesAcceptortoAcquirerISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOLatestversion
	 * CardPaymentsExchangesTerminalManagementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.StandAloneRemittanceAdviceISOLatestversion
	 * StandAloneRemittanceAdviceISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
	 * PostTradeForeignExchangeISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
	 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOLatestversion
	 * CollateralManagementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20142015
	 * CAPETerminalManagementMaintenance20142015}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20142015
	 * CAPEAcceptortoAcquirerMaintenance20142015}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.FactoringServicesISOLatestversion
	 * FactoringServicesISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.AcquirertoIssuerCardMessagesISOLatestversion
	 * AcquirertoIssuerCardMessagesISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion
	 * ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion
	 * MoneyMarketStatisticalReportingISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CrossBorderTransactionsCurrencyControlReportingISOLatestversion
	 * CrossBorderTransactionsCurrencyControlReportingISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion
	 * SettlementAndReconciliationISO15022VariantsISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion
	 * CorporateActionsISO15022VariantsISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.BankServicesBillingISOPreviousversion
	 * BankServicesBillingISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.StandAloneRemittanceAdviceISOPreviousversion
	 * StandAloneRemittanceAdviceISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOPreviousversion
	 * CollateralManagementISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20152016
	 * CAPEAcceptortoAcquirerMaintenance20152016}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20152016
	 * CAPETerminalManagementMaintenance20152016}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.InvoiceTaxReportISOLatestversion
	 * InvoiceTaxReportISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion
	 * ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.TransparencyOfHoldingsMaintenance20162017
	 * TransparencyOfHoldingsMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CorporateActionsMaintenance20162017
	 * CorporateActionsMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017
	 * PostTradeForeignExchangeMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
	 * MX_Payment_Maintenance_2016_2017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CreditorPaymentActivationRequestMaintenance20162017
	 * CreditorPaymentActivationRequestMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationMaintenance20162017
	 * PaymentsInitiationMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsMandatesMaintenance20162017
	 * PaymentsMandatesMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017
	 * ExceptionsandInvestigationsMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.StandAloneRemittanceAdviceMaintenance20162017
	 * StandAloneRemittanceAdviceMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
	 * PaymentsClearingandSettlementMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017
	 * SettlementandReconciliationMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CollateralManagementMaintenance20162017
	 * CollateralManagementMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants
	 * SettlementandReconciliationMaintenance20162017ISO15022Variants}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion
	 * SettlementAndReconciliationISO15022VariantsISOPreviousversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
	 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion
	 * MoneyMarketStatisticalReportingISOLatestversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20162017
	 * CAPEAcceptortoAcquirerMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20162017
	 * CAPETerminalManagementMaintenance20162017}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting 
	 * FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsInitiationPreviousVersion
	 * PaymentsInitiationPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsInitiationLatestVersion
	 * PaymentsInitiationLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
	 * AccountManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
	 * AccountManagementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AdministrationLatestVersion
	 * AdministrationLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
	 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
	 * CashManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
	 * CashManagementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TerminalManagementPreviousVersion
	 * TerminalManagementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
	 * CollateralManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion
	 * BusinessApplicationHeaderLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
	 * PaymentsClearingandSettlementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
	 * ReferenceDataLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ReferenceDataPreviousVersion
	 * ReferenceDataPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
	 * SecuritiesClearingLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
	 * SecuritiesEventsLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant
	 * SecuritiesEventsLatestversionsubsetvariant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
	 * SecuritiesEventsPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
	 * SecuritiesManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestversionsubsetvariant
	 * SecuritiesManagementLatestversionsubsetvariant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousVersion
	 * SecuritiesManagementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousversionsubsetvariant
	 * SecuritiesManagementPreviousversionsubsetvariant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
	 * SecuritiesSettlementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestversionsubsetvariant
	 * SecuritiesSettlementLatestversionsubsetvariant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousVersion
	 * SecuritiesSettlementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousversionsubsetvariant
	 * SecuritiesSettlementPreviousversionsubsetvariant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
	 * SecuritiesTradeLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
	 * SecuritiesTradePreviousVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.TreasuryArchive
	 * TreasuryArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
	 * TradeServicesInitiationLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
	 * TradeServicesManagementLatestVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
	 * AuthoritiesLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementPreviousVersion
	 * PaymentsClearingandSettlementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TradeServicesManagementPreviousVersion
	 * TradeServicesManagementPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
	 * TradeServicesLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SupplementaryDataLatestVersion
	 * SupplementaryDataLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion
	 * AcceptortoAcquirerCardTransactionPreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TerminalManagementLatestVersion
	 * TerminalManagementLatestVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.OtherMessages
	 * OtherMessages}</li>
	 * <li>{@linkplain com.tools20022.repository.area.CashManagementArchive
	 * CashManagementArchive}</li>
	 * <li>{@linkplain com.tools20022.repository.area.ReferenceDataArchive
	 * ReferenceDataArchive}</li>
	 * <li>{@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
	 * PaymentsInitiationArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
	 * SecuritiesManagementArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
	 * SecuritiesSettlementArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
	 * PaymentsClearingandSettlementArchive}</li>
	 * <li>{@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
	 * SecuritiesEventsArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
	 * ForeignExchangeTradeLatestVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
	 * SecuritiesTradeArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.TradeServicesManagementArchive
	 * TradeServicesManagementArchive}</li>
	 * <li>{@linkplain com.tools20022.repository.area.AccountManagementArchive
	 * AccountManagementArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsRemittanceAdviceLatestVersion
	 * PaymentsRemittanceAdviceLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradePreviousVersion
	 * ForeignExchangeTradePreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ATMManagementLatestVersion
	 * ATMManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
	 * ATMCardTransactionLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
	 * CollateralManagementPreviousVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.TerminalManagementArchive
	 * TerminalManagementArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
	 * AcceptortoAcquirerCardTransactionArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion
	 * AcquirertoIssuerCardTransactionLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsRemittanceAdvicePreviousVersion
	 * PaymentsRemittanceAdvicePreviousVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CollateralManagementArchive
	 * CollateralManagementArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsRemittanceAdviceArchive
	 * PaymentsRemittanceAdviceArchive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.other.BUSINESSPROCESS_FOR_ROLES
	 * BUSINESSPROCESS_FOR_ROLES}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * </ul>
	 */
	public static final MMBusinessProcessCatalogue catalogue = new MMBusinessProcessCatalogue() {
		{
			topLevelCatalogueEntry_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestISOPreviousversion.mmObject(), CreditorPaymentActivationRequestISOLatestversion.mmObject(),
					CardPaymentsExchangesTerminalManagementISOPreviousversion.mmObject(), CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion.mmObject(), DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject(),
					InvestmentFundsISOPreviousversion.mmObject(), ProxyVotingISOLatestversion.mmObject(), IssuersAgentsCommunicationISOLatestversion.mmObject(), TransactionRegulatoryReportingISOArchive.mmObject(),
					ChangeorVerifyAccountIdentificationISOLatestversion.mmObject(), BankAccountManagementISOLatestversion.mmObject(), PaymentsInitiationISOPreviousversion.mmObject(), PaymentsMandatesISOPreviousversion.mmObject(),
					PaymentsClearingandSettlementISOPreviousversion.mmObject(), BanktoCustomerCashManagementISOLatestversion.mmObject(), NotificationtoReceiveISOPreviousversion.mmObject(),
					ExceptionsandInvestigationsISOPreviousversion.mmObject(), ForexNotificationsISOArchive.mmObject(), InvoiceFinancingRequestISOLatestversion.mmObject(), FinancialInvoiceISOArchive.mmObject(),
					TradeServicesManagementISOPreviousversion.mmObject(), BanktoCustomerCashManagementISOPreviousversion.mmObject(), ChangeorVerifyAccountIdentificationISOPreviousversion.mmObject(),
					SettlementAndReconciliationISOPreviousversion.mmObject(), CorporateActionsISOPreviousversion.mmObject(), ExceptionsandInvestigationsISOLatestversion.mmObject(), PaymentsInitiationISOLatestversion.mmObject(),
					PaymentsMandatesISOLatestversion.mmObject(), NotificationtoReceiveISOLatestversion.mmObject(), PaymentsClearingandSettlementISOLatestversion.mmObject(), PostTradeMatchingISOPreviousversion.mmObject(),
					TotalPortfolioValuationReportISOLatestversion.mmObject(), ProxyVotingISOPreviousversion.mmObject(), AuthoritiesFinancialInvestigationsISOLatestversion.mmObject(), BankServicesBillingISOLatestversion.mmObject(),
					BankAccountManagementISOPreviousversion.mmObject(), ISOArchive.mmObject(), SSIforSecuritiesPaymentsandForeignExchange.mmObject(), SupplementaryDataISOLatestversion.mmObject(),
					TradeServicesManagementISOLatestversion.mmObject(), CAPEAcceptortoAcquirerMaintenance20132014.mmObject(), CAPETerminalManagementMaintenance20132014.mmObject(), SettlementAndReconciliationISOLatestversion.mmObject(),
					CorporateActionsISOLatestversion.mmObject(), InvestmentFundsISOLatestversion.mmObject(), PostTradeMatchingISOLatestversion.mmObject(), CardPaymentsExchangesAcceptortoAcquirerISOLatestversion.mmObject(),
					CardPaymentsExchangesTerminalManagementISOLatestversion.mmObject(), StandAloneRemittanceAdviceISOLatestversion.mmObject(), PostTradeForeignExchangeISOLatestversion.mmObject(),
					CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject(), CollateralManagementISOLatestversion.mmObject(), CAPETerminalManagementMaintenance20142015.mmObject(),
					CAPEAcceptortoAcquirerMaintenance20142015.mmObject(), FactoringServicesISOLatestversion.mmObject(), AcquirertoIssuerCardMessagesISOLatestversion.mmObject(),
					ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion.mmObject(), MoneyMarketStatisticalReportingISOPreviousversion.mmObject(),
					CrossBorderTransactionsCurrencyControlReportingISOLatestversion.mmObject(), SettlementAndReconciliationISO15022VariantsISOLatestversion.mmObject(), CorporateActionsISO15022VariantsISOLatestversion.mmObject(),
					BankServicesBillingISOPreviousversion.mmObject(), StandAloneRemittanceAdviceISOPreviousversion.mmObject(), CollateralManagementISOPreviousversion.mmObject(), CAPEAcceptortoAcquirerMaintenance20152016.mmObject(),
					CAPETerminalManagementMaintenance20152016.mmObject(), InvoiceTaxReportISOLatestversion.mmObject(), ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject(),
					TransparencyOfHoldingsMaintenance20162017.mmObject(), CorporateActionsMaintenance20162017.mmObject(), PostTradeForeignExchangeMaintenance20162017.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(),
					CreditorPaymentActivationRequestMaintenance20162017.mmObject(), PaymentsInitiationMaintenance20162017.mmObject(), PaymentsMandatesMaintenance20162017.mmObject(),
					ExceptionsandInvestigationsMaintenance20162017.mmObject(), StandAloneRemittanceAdviceMaintenance20162017.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject(),
					SettlementandReconciliationMaintenance20162017.mmObject(), CollateralManagementMaintenance20162017.mmObject(), SettlementandReconciliationMaintenance20162017ISO15022Variants.mmObject(),
					SettlementAndReconciliationISO15022VariantsISOPreviousversion.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject(), MoneyMarketStatisticalReportingISOLatestversion.mmObject(),
					CAPEAcceptortoAcquirerMaintenance20162017.mmObject(), CAPETerminalManagementMaintenance20162017.mmObject(),
					FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting.mmObject(), PaymentsInitiationPreviousVersion.mmObject(), PaymentsInitiationLatestVersion.mmObject(),
					AccountManagementLatestVersion.mmObject(), AccountManagementPreviousVersion.mmObject(), AdministrationLatestVersion.mmObject(), AcceptortoAcquirerCardTransactionLatestVersion.mmObject(),
					CashManagementLatestVersion.mmObject(), CashManagementPreviousVersion.mmObject(), TerminalManagementPreviousVersion.mmObject(), CollateralManagementLatestVersion.mmObject(),
					BusinessApplicationHeaderLatestVersion.mmObject(), PaymentsClearingandSettlementLatestVersion.mmObject(), ReferenceDataLatestVersion.mmObject(), ReferenceDataPreviousVersion.mmObject(),
					SecuritiesClearingLatestVersion.mmObject(), SecuritiesEventsLatestVersion.mmObject(), SecuritiesEventsLatestversionsubsetvariant.mmObject(), SecuritiesEventsPreviousVersion.mmObject(),
					SecuritiesManagementLatestVersion.mmObject(), SecuritiesManagementLatestversionsubsetvariant.mmObject(), SecuritiesManagementPreviousVersion.mmObject(), SecuritiesManagementPreviousversionsubsetvariant.mmObject(),
					SecuritiesSettlementLatestVersion.mmObject(), SecuritiesSettlementLatestversionsubsetvariant.mmObject(), SecuritiesSettlementPreviousVersion.mmObject(), SecuritiesSettlementPreviousversionsubsetvariant.mmObject(),
					SecuritiesTradeLatestVersion.mmObject(), SecuritiesTradePreviousVersion.mmObject(), TreasuryArchive.mmObject(), TradeServicesInitiationLatestVersion.mmObject(), TradeServicesManagementLatestVersion.mmObject(),
					AuthoritiesLatestVersion.mmObject(), PaymentsClearingandSettlementPreviousVersion.mmObject(), TradeServicesManagementPreviousVersion.mmObject(), TradeServicesLatestVersion.mmObject(),
					SupplementaryDataLatestVersion.mmObject(), AcceptortoAcquirerCardTransactionPreviousVersion.mmObject(), TerminalManagementLatestVersion.mmObject(), OtherMessages.mmObject(), CashManagementArchive.mmObject(),
					ReferenceDataArchive.mmObject(), PaymentsInitiationArchive.mmObject(), SecuritiesManagementArchive.mmObject(), SecuritiesSettlementArchive.mmObject(), PaymentsClearingandSettlementArchive.mmObject(),
					SecuritiesEventsArchive.mmObject(), ForeignExchangeTradeLatestVersion.mmObject(), SecuritiesTradeArchive.mmObject(), TradeServicesManagementArchive.mmObject(), AccountManagementArchive.mmObject(),
					PaymentsRemittanceAdviceLatestVersion.mmObject(), ForeignExchangeTradePreviousVersion.mmObject(), ATMManagementLatestVersion.mmObject(), ATMCardTransactionLatestVersion.mmObject(),
					CollateralManagementPreviousVersion.mmObject(), TerminalManagementArchive.mmObject(), AcceptortoAcquirerCardTransactionArchive.mmObject(), AcquirertoIssuerCardTransactionLatestVersion.mmObject(),
					PaymentsRemittanceAdvicePreviousVersion.mmObject(), CollateralManagementArchive.mmObject(), PaymentsRemittanceAdviceArchive.mmObject(), BUSINESSPROCESS_FOR_ROLES.mmObject());
			repository_lazy = () -> GeneratedRepository.mmObject();
		}
	};
	/**
	 * An instance of DataDictionary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMDataDictionary#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMDataDictionary#getTopLevelDictionaryEntry
	 * topLevelDictionaryEntry} = List of 15848 elements</li>
	 * </ul>
	 */
	public static final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			topLevelDictionaryEntry_lazy = () -> ListBuilderForGeneratedRepository_00.addElems(new ArrayList<>());
			repository_lazy = () -> GeneratedRepository.mmObject();
		}
	};

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}

	final static public MMRepository mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRepository() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
			}
		});
		return mmObject_lazy.get();
	}
}