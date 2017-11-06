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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.PaymentSchemeChoice;
import com.tools20022.repository.codeset.SettlementMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Instruction between two financial institutions stipulating the cash transfer
 * characteristics between the two parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashSettlement" src="doc-files/CashSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
 * CashSettlement.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
 * CashSettlement.mmInterbankSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmRTGS
 * CashSettlement.mmRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmCreditDateTime
 * CashSettlement.mmCreditDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementMethod
 * CashSettlement.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
 * CashSettlement.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmDebitDateTime
 * CashSettlement.mmDebitDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
 * CashSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedTransactionAdministrator
 * CashSettlement.mmRelatedTransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
 * CashSettlement.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedInvestigationCase
 * CashSettlement.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
 * CashSettlement.mmReservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
 * CashAccount.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
 * TransactionAdministrator.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
 * Reservation.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
 * BookEntry.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmSettlementInformation
 * RequestedModification3.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmSettlementInformation
 * RequestedModification4.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmSettlementInformation
 * RequestedModification5.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmSettlementInformation
 * RequestedModification6.mmSettlementInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation3
 * SettlementInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation1
 * SettlementInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation13
 * SettlementInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction4
 * SettlementInstruction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
 * SettlementDateTimeIndication1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction1
 * SettlementInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation2
 * SettlementInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation14
 * SettlementInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction2
 * SettlementInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation16
 * SettlementInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentSchemeChoice
 * PaymentSchemeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnInformation1
 * ReturnInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation15
 * SettlementInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResolutionInformation1
 * ResolutionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms1
 * SettlementTerms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms2
 * SettlementTerms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction3
 * SettlementInstruction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation10
 * SettlementInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation6
 * SettlementInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation11
 * SettlementInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation12
 * SettlementInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation8
 * SettlementInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation9
 * SettlementInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms3
 * SettlementTerms3}</li>
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
 * "CashSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties."
 * </li>
 * </ul>
 */
public class CashSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount interbankSettlementAmount;
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInterbankSettlementAmount
	 * PaymentInstructionReference1Details.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmInterbankSettlementAmount
	 * PaymentInstructionReference2Details.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInterbankSettlementAmount
	 * PaymentInstructionReferenceDetails3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmInterbankSettlementAmount
	 * PaymentInstructionReferenceDetails4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmInterBankSettlementAmount
	 * LongPaymentIdentification1.mmInterBankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmInterbankSettlementAmount
	 * PaymentSearch2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInterbankSettlementAmount
	 * PaymentSearch3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementAmount
	 * PaymentSearch4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInterbankSettlementAmount
	 * PaymentDetails5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmInterbankSettlementAmount
	 * PaymentDetails6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmInterbankSettlementAmount
	 * PaymentDetails7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInterbankSettlementAmount
	 * PaymentInstruction1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmInterbankSettlementAmount
	 * OriginalTransactionReference1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation3.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmInterbankSettlementAmount
	 * OriginalTransactionReference13.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmInterbankSettlementAmount
	 * OriginalTransactionReference16.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmTotalInterbankSettlementAmount
	 * GroupHeader2.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmTotalInterbankSettlementAmount
	 * GroupHeader33.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation11.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmTotalInterbankSettlementAmount
	 * GroupHeader49.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInterbankSettlementAmount
	 * CreditTransferTransaction2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInterbankSettlementAmount
	 * CreditTransferTransaction7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmTotalInterbankSettlementAmount
	 * GroupHeader3.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmTotalInterbankSettlementAmount
	 * GroupHeader34.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation10.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmTotalInterbankSettlementAmount
	 * GroupHeader50.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation12.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation14.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation31.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction38.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction48.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader9.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation5.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation5.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader41.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation29.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation29.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader57.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction36.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmReversedInterbankSettlementAmount
	 * PaymentTransaction36.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction45.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversedInterbankSettlementAmount
	 * PaymentTransaction45.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmTotalInterbankSettlementAmount
	 * GroupHeader4.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmTotalInterbankSettlementAmount
	 * GroupHeader35.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation13.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmTotalInterbankSettlementAmount
	 * GroupHeader51.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmInterbankSettlementAmount
	 * CreditTransferTransaction4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmInterbankSettlementAmount
	 * CreditTransferTransaction8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader6.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation2.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation2.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader38.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation27.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation27.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader54.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction34.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction34.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction44.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction44.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmInterbankSettlementAmount
	 * OriginalTransactionReference15.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmInterbankSettlementAmount
	 * OriginalTransactionReference17.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInterbankSettledAmount
	 * RequestedModification.mmInterbankSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementAmount
	 * PaymentInstructionExtract2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#mmReturnedInterbankSettlementAmount
	 * ReturnInformation1.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInterbankSettlementAmount
	 * CorrectivePaymentInstructionExtract.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInterbankSettlementAmount
	 * RequestedModification2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmInterbankSettlementAmount
	 * ResolutionInformation1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation33.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInterbankSettlementAmount
	 * CorrectiveInterbankTransaction1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction40.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInterbankSettlementAmount
	 * RequestedModification3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation15.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmTotalInterbankSettlementAmount
	 * CreditTransferTransaction9.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation13.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation13.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation18.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation18.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmInterbankSettlementAmount
	 * OriginalTransactionReference9.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmInterbankSettlementAmount
	 * OriginalTransactionReference12.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmInterbankSettlementAmount
	 * OriginalTransactionReference8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmInterbankSettlementAmount
	 * OriginalTransactionReference11.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation14.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation14.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation20.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation20.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation16.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation16.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation23.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation23.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation17.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation17.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation24.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation24.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation21.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation21.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation9.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmTotalInterbankSettlementAmount
	 * GroupHeader19.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmTotalInterbankSettlementAmount
	 * GroupHeader24.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmTotalInterbankSettlementAmount
	 * GroupHeader20.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmTotalInterbankSettlementAmount
	 * GroupHeader25.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmTotalInterbankSettlementAmount
	 * GroupHeader15.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmTotalInterbankSettlementAmount
	 * GroupHeader26.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader17.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader27.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader22.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader28.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmTotalInterbankSettlementAmount
	 * GroupHeader16.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmTotalInterbankSettlementAmount
	 * GroupHeader29.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader18.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader30.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader21.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementAmount
	 * PaymentSearch5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInterbankSettlementAmount
	 * PaymentInstruction14.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction50.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction50.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmInterbankSettlementAmount
	 * CreditTransferTransaction17.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInterbankSettlementAmount
	 * CreditTransferTransaction19.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation17.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction51.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversedInterbankSettlementAmount
	 * PaymentTransaction51.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInterbankSettlementAmount
	 * RequestedModification4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction53.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmInterbankSettlementAmount
	 * OriginalTransactionReference20.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction55.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmUpFrontPayment
	 * SecuritiesTransaction1.mmUpFrontPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInterbankSettlementAmount
	 * CreditTransferTransaction23.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmTotalInterbankSettlementAmount
	 * GroupHeader70.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInterbankSettlementAmount
	 * RequestedModification5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInterbankSettlementAmount
	 * CreditTransferTransaction25.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader72.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction65.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction65.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation20.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction60.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversedInterbankSettlementAmount
	 * PaymentTransaction60.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader71.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmInterbankSettlementAmount
	 * OriginalTransactionReference22.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction67.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction62.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation21.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction81.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmReversedInterbankSettlementAmount
	 * PaymentTransaction81.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInterbankSettlementAmount
	 * RequestedModification6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction76.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction76.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmInterbankSettlementAmount
	 * OriginalTransactionReference24.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction75.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction79.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation6.mmInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterbankSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstructionReference2Details.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.LongPaymentIdentification1.mmInterBankSettlementAmount, com.tools20022.repository.msg.PaymentSearch2.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentSearch3.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentSearch4.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentDetails5.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentDetails6.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentDetails7.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstruction1.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference1.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation3.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference13.mmInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference16.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader2.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader33.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader49.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction2.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction7.mmInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader3.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.mmInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader34.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.mmInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader50.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.mmInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation14.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation31.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction38.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction48.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader9.mmTotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation5.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation5.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader41.mmTotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation29.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation29.mmReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader57.mmTotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction36.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction36.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction45.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction45.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader4.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation3.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader35.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation13.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader51.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction4.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction8.mmInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader6.mmTotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation2.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation2.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader38.mmTotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation27.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation27.mmReturnedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader54.mmTotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction34.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction34.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction44.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction44.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference15.mmInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference17.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification.mmInterbankSettledAmount, com.tools20022.repository.msg.PaymentInstructionExtract2.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.ReturnInformation1.mmReturnedInterbankSettlementAmount, com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.RequestedModification2.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.mmInterbankSettlementAmount, com.tools20022.repository.msg.ResolutionInformation1.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation33.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentComplementaryInformation3.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction40.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.RequestedModification3.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.mmInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction9.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation13.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation13.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation18.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation18.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference9.mmInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference12.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference8.mmInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference11.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation14.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation14.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation20.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation20.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation16.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation23.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation23.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation17.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation17.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation21.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation21.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation6.mmInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation8.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation9.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader19.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader24.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader20.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader25.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader15.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader26.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader17.mmTotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader27.mmTotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader22.mmTotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader28.mmTotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader16.mmTotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader29.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader18.mmTotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader30.mmTotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation5.mmInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation7.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation6.mmInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation8.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader21.mmTotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentSearch5.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentInstruction14.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentComplementaryInformation4.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction50.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction50.mmReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction17.mmInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction19.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction51.mmReversedInterbankSettlementAmount, com.tools20022.repository.msg.RequestedModification4.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction53.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference20.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction55.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.SecuritiesTransaction1.mmUpFrontPayment,
					com.tools20022.repository.msg.CreditTransferTransaction23.mmInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader70.mmTotalInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification5.mmInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction25.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader72.mmTotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction65.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction65.mmReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentComplementaryInformation5.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction60.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction60.mmReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader71.mmTotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference22.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction67.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction62.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction81.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction81.mmReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification6.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction76.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction76.mmReturnedInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference24.mmInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction75.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmInterbankSettlementAmount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODateTime interbankSettlementDate;
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInterbankValueDate
	 * PaymentInstructionReference1Details.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmInterbankValueDate
	 * PaymentInstructionReference2Details.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInterbankValueDate
	 * PaymentInstructionReferenceDetails3.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmInterbankValueDate
	 * PaymentInstructionReferenceDetails4.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmInterBankSettlementDate
	 * LongPaymentIdentification1.mmInterBankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmInterBankSettlementDate
	 * ShortPaymentIdentification1.mmInterBankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementDate
	 * PaymentSearch4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInterbankValueDate
	 * PaymentDetails5.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmInterbankValueDate
	 * PaymentDetails6.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmInterbankValueDate
	 * PaymentDetails7.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInterbankSettlementDate
	 * PaymentInstruction1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmInterbankSettlementDate
	 * TransactionDates1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmInterbankSettlementDate
	 * TransactionDates2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmInterbankSettlementDate
	 * OriginalTransactionReference1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmInterbankSettlementDate
	 * OriginalTransactionReference13.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmInterbankSettlementDate
	 * OriginalTransactionReference16.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmInterbankSettlementDate
	 * GroupHeader2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmInterbankSettlementDate
	 * GroupHeader33.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation11.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmInterbankSettlementDate
	 * GroupHeader49.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInterbankSettlementDate
	 * CreditTransferTransaction2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInterbankSettlementDate
	 * CreditTransferTransaction7.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmInterbankSettlementDate
	 * GroupHeader3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmInterbankSettlementDate
	 * GroupHeader34.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation10.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmInterbankSettlementDate
	 * GroupHeader50.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation12.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation14.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalInterbankSettlementDate
	 * PaymentTransaction38.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalInterbankSettlementDate
	 * PaymentTransaction48.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmInterbankSettlementDate
	 * GroupHeader9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmInterbankSettlementDate
	 * PaymentTransactionInformation5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmInterbankSettlementDate
	 * GroupHeader41.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmInterbankSettlementDate
	 * PaymentTransactionInformation29.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmInterbankSettlementDate
	 * GroupHeader57.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmInterbankSettlementDate
	 * PaymentTransaction36.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmInterbankSettlementDate
	 * PaymentTransaction45.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmInterbankSettlementDate
	 * GroupHeader4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmInterbankSettlementDate
	 * GroupHeader35.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation13.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmInterbankSettlementDate
	 * GroupHeader51.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmInterbankSettlementDate
	 * CreditTransferTransaction4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmInterbankSettlementDate
	 * CreditTransferTransaction8.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmInterbankSettlementDate
	 * GroupHeader6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmInterbankSettlementDate
	 * PaymentTransactionInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmInterbankSettlementDate
	 * GroupHeader38.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmInterbankSettlementDate
	 * PaymentTransactionInformation27.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmInterbankSettlementDate
	 * GroupHeader54.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmInterbankSettlementDate
	 * PaymentTransaction34.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmInterbankSettlementDate
	 * PaymentTransaction44.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmInterbankSettlementDate
	 * OriginalTransactionReference15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmInterbankSettlementDate
	 * OriginalTransactionReference17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#mmSettlementDate
	 * CashInForecast2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSettlementDate
	 * CashOutForecast2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#mmCashSettlementDate
	 * CashInForecast4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmCashSettlementDate
	 * CashOutForecast4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#mmSettlementDate
	 * CashInForecast1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#mmSettlementDate
	 * CashOutForecast1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#mmCashSettlementDate
	 * CashInForecast3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmCashSettlementDate
	 * CashOutForecast3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementDate
	 * PaymentInstructionExtract2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#mmInterbankSettlementDate
	 * ReturnInformation1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInterbankSettlementDate
	 * CorrectivePaymentInstructionExtract.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInterbankSettlementDate
	 * RequestedModification2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInterbankSettlementDate
	 * PaymentComplementaryInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmInterbankSettlementDate
	 * ResolutionInformation1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalInterbankSettlementDate
	 * PaymentTransactionInformation33.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInterbankSettlementDate
	 * CorrectiveInterbankTransaction1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInterbankSettlementDate
	 * PaymentComplementaryInformation3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalInterbankSettlementDate
	 * PaymentTransaction40.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInterbankSettlementDate
	 * RequestedModification3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInterbankSettlementDate
	 * CreditTransferTransaction9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmInterbankSettlementDate
	 * OriginalTransactionReference7.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmInterbankSettlementDate
	 * OriginalTransactionReference10.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmInterbankSettlementDate
	 * OriginalTransactionReference9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmInterbankSettlementDate
	 * OriginalTransactionReference12.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmInterbankSettlementDate
	 * OriginalTransactionReference8.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmInterbankSettlementDate
	 * OriginalTransactionReference11.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmInterbankSettlementDate
	 * PaymentTransactionInformation16.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmInterbankSettlementDate
	 * PaymentTransactionInformation17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmInterbankSettlementDate
	 * PaymentTransactionInformation21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation7.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmInterbankSettlementDate
	 * GroupHeader19.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmInterbankSettlementDate
	 * GroupHeader24.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmInterbankSettlementDate
	 * GroupHeader20.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmInterbankSettlementDate
	 * GroupHeader25.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmInterbankSettlementDate
	 * GroupHeader15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmInterbankSettlementDate
	 * GroupHeader26.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmInterbankSettlementDate
	 * GroupHeader17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmInterbankSettlementDate
	 * GroupHeader27.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmInterbankSettlementDate
	 * GroupHeader22.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmInterbankSettlementDate
	 * GroupHeader28.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmInterbankSettlementDate
	 * GroupHeader16.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmInterbankSettlementDate
	 * GroupHeader29.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmInterbankSettlementDate
	 * GroupHeader18.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmInterbankSettlementDate
	 * GroupHeader30.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmInterbankSettlementDate
	 * GroupHeader21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettlementDate
	 * IntraBalance2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1#mmSettlementDate
	 * IntraBalance1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementDate
	 * PaymentSearch5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInterbankSettlementDate
	 * PaymentInstruction14.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashSettlementDate
	 * CashOutForecast5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#mmCashSettlementDate
	 * CashInForecast5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmCashSettlementDate
	 * CashOutForecast6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#mmCashSettlementDate
	 * CashInForecast6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInterbankSettlementDate
	 * PaymentComplementaryInformation4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmInterbankSettlementDate
	 * PaymentTransaction50.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmInterbankSettlementDate
	 * CreditTransferTransaction17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInterbankSettlementDate
	 * CreditTransferTransaction19.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmInterbankSettlementDate
	 * PaymentTransaction51.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInterbankSettlementDate
	 * RequestedModification4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalInterbankSettlementDate
	 * PaymentTransaction53.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmInterbankSettlementDate
	 * OriginalTransactionReference20.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalInterbankSettlementDate
	 * PaymentTransaction55.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInOutForecast7#mmCashSettlementDate
	 * CashInOutForecast7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInterbankSettlementDate
	 * CreditTransferTransaction23.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmInterbankSettlementDate
	 * GroupHeader70.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInterbankSettlementDate
	 * RequestedModification5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInterbankSettlementDate
	 * CreditTransferTransaction25.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmInterbankSettlementDate
	 * GroupHeader72.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmInterbankSettlementDate
	 * PaymentTransaction65.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInterbankSettlementDate
	 * PaymentComplementaryInformation5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation20.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmInterbankSettlementDate
	 * PaymentTransaction60.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmInterbankSettlementDate
	 * GroupHeader71.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmInterbankSettlementDate
	 * OriginalTransactionReference22.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalInterbankSettlementDate
	 * PaymentTransaction67.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalInterbankSettlementDate
	 * PaymentTransaction62.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmInterbankSettlementDate
	 * PaymentTransaction81.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInterbankSettlementDate
	 * RequestedModification6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmInterbankSettlementDate
	 * PaymentTransaction76.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmInterbankSettlementDate
	 * OriginalTransactionReference24.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInterbankSettlementDate
	 * PaymentTransaction75.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementDate
	 * PaymentTransaction79.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInterbankSettlementDate
	 * PaymentComplementaryInformation6.mmInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterbankSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.mmInterbankValueDate, com.tools20022.repository.msg.PaymentInstructionReference2Details.mmInterbankValueDate,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmInterbankValueDate, com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.mmInterbankValueDate,
					com.tools20022.repository.msg.LongPaymentIdentification1.mmInterBankSettlementDate, com.tools20022.repository.msg.ShortPaymentIdentification1.mmInterBankSettlementDate,
					com.tools20022.repository.msg.PaymentSearch4.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentDetails5.mmInterbankValueDate, com.tools20022.repository.msg.PaymentDetails6.mmInterbankValueDate,
					com.tools20022.repository.msg.PaymentDetails7.mmInterbankValueDate, com.tools20022.repository.msg.PaymentInstruction1.mmInterbankSettlementDate, com.tools20022.repository.msg.TransactionDates1.mmInterbankSettlementDate,
					com.tools20022.repository.msg.TransactionDates2.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference1.mmInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference13.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference16.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader2.mmInterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader33.mmInterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader49.mmInterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction2.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction7.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader3.mmInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader34.mmInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader50.mmInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.mmInterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation14.mmInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction38.mmOriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction48.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader9.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation5.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader41.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation29.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader57.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction36.mmInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction45.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader4.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader35.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader51.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction4.mmInterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction8.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader6.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation2.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader38.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation27.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader54.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction34.mmInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction44.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference15.mmInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference17.mmInterbankSettlementDate, com.tools20022.repository.msg.CashInForecast2.mmSettlementDate, com.tools20022.repository.msg.CashOutForecast2.mmSettlementDate,
					com.tools20022.repository.msg.CashInForecast4.mmCashSettlementDate, com.tools20022.repository.msg.CashOutForecast4.mmCashSettlementDate, com.tools20022.repository.msg.CashInForecast1.mmSettlementDate,
					com.tools20022.repository.msg.CashOutForecast1.mmSettlementDate, com.tools20022.repository.msg.CashInForecast3.mmCashSettlementDate, com.tools20022.repository.msg.CashOutForecast3.mmCashSettlementDate,
					com.tools20022.repository.msg.PaymentInstructionExtract2.mmInterbankSettlementDate, com.tools20022.repository.msg.ReturnInformation1.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.mmInterbankSettlementDate, com.tools20022.repository.msg.UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification2.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation2.mmInterbankSettlementDate,
					com.tools20022.repository.msg.ResolutionInformation1.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation33.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.mmInterbankSettlementDate, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction40.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification3.mmInterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation15.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction9.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference7.mmInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference10.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference9.mmInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference12.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference8.mmInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference11.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation16.mmInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransactionInformation17.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation21.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader19.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader24.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader20.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader25.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader15.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader26.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader17.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader27.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader22.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader28.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader16.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader29.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader18.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader30.mmInterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation6.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader21.mmInterbankSettlementDate, com.tools20022.repository.msg.IntraBalance2.mmSettlementDate, com.tools20022.repository.msg.IntraBalance1.mmSettlementDate,
					com.tools20022.repository.msg.PaymentSearch5.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentInstruction14.mmInterbankSettlementDate, com.tools20022.repository.msg.CashOutForecast5.mmCashSettlementDate,
					com.tools20022.repository.msg.CashInForecast5.mmCashSettlementDate, com.tools20022.repository.msg.CashOutForecast6.mmCashSettlementDate, com.tools20022.repository.msg.CashInForecast6.mmCashSettlementDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction50.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction17.mmInterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction19.mmInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction51.mmInterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification4.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction53.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference20.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction55.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.CashInOutForecast7.mmCashSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction23.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader70.mmInterbankSettlementDate, com.tools20022.repository.msg.RequestedModification5.mmInterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction25.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader72.mmInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction65.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation5.mmInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction60.mmInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader71.mmInterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference22.mmInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction67.mmOriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction62.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction81.mmInterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification6.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction76.mmInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference24.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction75.mmOriginalInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction79.mmOriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation6.mmInterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max4AlphaNumericText rTGS;
	/**
	 * Qualifies the RTGS status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmRTGS
	 * PaymentStatusCode5Choice.mmRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmRTGS
	 * PaymentStatusCode6Choice.mmRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the RTGS status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRTGS = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCode5Choice.mmRTGS, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmRTGS);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected ISODateTime creditDateTime;
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the credit side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#mmCreditDateTime
	 * SettlementDateTimeIndication1.mmCreditDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInterbankSettlementDate
	 * PaymentTransactionInformation31.mmOriginalInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the credit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.mmCreditDateTime, com.tools20022.repository.msg.PaymentTransactionInformation31.mmOriginalInterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PaymentInstruction relatedPaymentInstruction;
	/**
	 * PaymentInstruction which is the source of the settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PaymentInstruction which is the source of the settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected SettlementMethodCode settlementMethod;
	/**
	 * Method used to settle the (batch of) payment instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmSettlementMethod
	 * SettlementInformation3.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#mmSettlementMethod
	 * SettlementInformation1.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmSettlementMethod
	 * SettlementInformation13.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmSettlementMethod
	 * SettlementInstruction4.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#mmSettlementMethod
	 * SettlementInstruction1.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#mmSettlementMethod
	 * SettlementInformation2.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#mmSettlementMethod
	 * SettlementInformation14.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmSettlementMethod
	 * SettlementInstruction2.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#mmSettlementMethod
	 * SettlementInformation16.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#mmSettlementMethod
	 * SettlementInformation10.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmSettlementMethod
	 * SettlementInformation6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#mmSettlementMethod
	 * SettlementInformation11.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#mmSettlementMethod
	 * SettlementInformation12.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#mmSettlementMethod
	 * SettlementInformation8.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmSettlementMethod
	 * SettlementInformation9.mmSettlementMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInformation3.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation1.mmSettlementMethod,
					com.tools20022.repository.msg.SettlementInformation13.mmSettlementMethod, com.tools20022.repository.msg.SettlementInstruction4.mmSettlementMethod, com.tools20022.repository.msg.SettlementInstruction1.mmSettlementMethod,
					com.tools20022.repository.msg.SettlementInformation2.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation14.mmSettlementMethod, com.tools20022.repository.msg.SettlementInstruction2.mmSettlementMethod,
					com.tools20022.repository.msg.SettlementInformation16.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation10.mmSettlementMethod,
					com.tools20022.repository.msg.SettlementInformation6.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation11.mmSettlementMethod,
					com.tools20022.repository.msg.SettlementInformation12.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation8.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation9.mmSettlementMethod);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}
	};
	protected CashAccount settlementAccount;
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
	 * CashAccount.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmSettlementDetails
	 * LocalMarketAnnex2.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmSettlementAccount
	 * SettlementInformation3.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#mmSettlementAccount
	 * SettlementInformation1.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmSettlementAccount
	 * SettlementInformation13.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmSettlementAccount
	 * SettlementInstruction4.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#mmSettlementAccount
	 * SettlementInstruction1.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#mmSettlementAccount
	 * SettlementInformation2.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#mmSettlementAccount
	 * SettlementInformation14.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmSettlementAccount
	 * SettlementInstruction2.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Demand1#mmSettlementAccount
	 * Demand1.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#mmSettlementAccount
	 * SettlementInformation16.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmNostroVostroAccount
	 * PaymentComplementaryInformation.mmNostroVostroAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInformation15#mmPaymentAccount
	 * PaymentInformation15.mmPaymentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#mmSettlementAccount
	 * SettlementInformation10.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmSettlementAccount
	 * SettlementInformation6.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#mmSettlementAccount
	 * SettlementInformation11.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#mmSettlementAccount
	 * SettlementInformation12.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#mmSettlementAccount
	 * SettlementInformation8.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmSettlementAccount
	 * SettlementInformation9.mmSettlementAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex2.mmSettlementDetails, com.tools20022.repository.msg.SettlementInformation3.mmSettlementAccount,
					com.tools20022.repository.msg.SettlementInformation1.mmSettlementAccount, com.tools20022.repository.msg.SettlementInformation13.mmSettlementAccount,
					com.tools20022.repository.msg.SettlementInstruction4.mmSettlementAccount, com.tools20022.repository.msg.SettlementInstruction1.mmSettlementAccount,
					com.tools20022.repository.msg.SettlementInformation2.mmSettlementAccount, com.tools20022.repository.msg.SettlementInformation14.mmSettlementAccount,
					com.tools20022.repository.msg.SettlementInstruction2.mmSettlementAccount, com.tools20022.repository.msg.Demand1.mmSettlementAccount, com.tools20022.repository.msg.SettlementInformation16.mmSettlementAccount,
					com.tools20022.repository.msg.PaymentComplementaryInformation.mmNostroVostroAccount, com.tools20022.repository.msg.PaymentInformation15.mmPaymentAccount,
					com.tools20022.repository.msg.SettlementInformation10.mmSettlementAccount, com.tools20022.repository.msg.SettlementInformation6.mmSettlementAccount,
					com.tools20022.repository.msg.SettlementInformation11.mmSettlementAccount, com.tools20022.repository.msg.SettlementInformation12.mmSettlementAccount,
					com.tools20022.repository.msg.SettlementInformation8.mmSettlementAccount, com.tools20022.repository.msg.SettlementInformation9.mmSettlementAccount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected ISODateTime debitDateTime;
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the debit side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#mmDebitDateTime
	 * SettlementDateTimeIndication1.mmDebitDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the debit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDebitDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.mmDebitDateTime);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashSettlementInstructionPartyRole> partyRole;
	/**
	 * Specifies each role linked to the settlement of a payment and played by a
	 * party at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
	 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#mmCSDOrNCB
	 * BillingReport1.mmCSDOrNCB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmCSDOrNCB
	 * BillingSearchCriteria1.mmCSDOrNCB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingReport1.mmCSDOrNCB, com.tools20022.repository.msg.BillingSearchCriteria1.mmCSDOrNCB);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TransactionAdministrator> relatedTransactionAdministrator;
	/**
	 * Transaction administrator which manages the related settlement
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
	 * TransactionAdministrator.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction administrator which manages the related settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected BookEntry bookEntry;
	/**
	 * Movement of cash between two accounts in the same financial institution,
	 * resulting from the settlement of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
	 * BookEntry.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCase;
	/**
	 * Case resolution which is the source of the correction of a settlement
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
	 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case resolution which is the source of the correction of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected Reservation reservation;
	/**
	 * Liquidity set aside by the payer for specific purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
	 * Reservation.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReservation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.mmSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction,
						com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction, com.tools20022.repository.entity.Reservation.mmSettlementInstruction,
						com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification3.mmSettlementInformation, com.tools20022.repository.msg.RequestedModification4.mmSettlementInformation,
						com.tools20022.repository.msg.RequestedModification5.mmSettlementInformation, com.tools20022.repository.msg.RequestedModification6.mmSettlementInformation);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementAmount, com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementDate,
						com.tools20022.repository.entity.CashSettlement.mmRTGS, com.tools20022.repository.entity.CashSettlement.mmCreditDateTime, com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction,
						com.tools20022.repository.entity.CashSettlement.mmSettlementMethod, com.tools20022.repository.entity.CashSettlement.mmSettlementAccount, com.tools20022.repository.entity.CashSettlement.mmDebitDateTime,
						com.tools20022.repository.entity.CashSettlement.mmPartyRole, com.tools20022.repository.entity.CashSettlement.mmRelatedTransactionAdministrator, com.tools20022.repository.entity.CashSettlement.mmBookEntry,
						com.tools20022.repository.entity.CashSettlement.mmRelatedInvestigationCase, com.tools20022.repository.entity.CashSettlement.mmReservation);
				derivationComponent_lazy = () -> Arrays.asList(SettlementInformation3.mmObject(), SettlementInformation1.mmObject(), SettlementInformation13.mmObject(), SettlementInstruction4.mmObject(),
						SettlementDateTimeIndication1.mmObject(), SettlementInstruction1.mmObject(), SettlementInformation2.mmObject(), SettlementInformation14.mmObject(), SettlementInstruction2.mmObject(),
						SettlementInformation16.mmObject(), PaymentSchemeChoice.mmObject(), ReturnInformation1.mmObject(), SettlementInformation15.mmObject(), ResolutionInformation1.mmObject(), SettlementTerms1.mmObject(),
						SettlementTerms2.mmObject(), SettlementInstruction3.mmObject(), SettlementInformation10.mmObject(), SettlementInformation6.mmObject(), SettlementInformation11.mmObject(), SettlementInformation12.mmObject(),
						SettlementInformation8.mmObject(), SettlementInformation9.mmObject(), SettlementTerms3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(CurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	public ISODateTime getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public void setInterbankSettlementDate(ISODateTime interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
	}

	public Max4AlphaNumericText getRTGS() {
		return rTGS;
	}

	public void setRTGS(Max4AlphaNumericText rTGS) {
		this.rTGS = rTGS;
	}

	public ISODateTime getCreditDateTime() {
		return creditDateTime;
	}

	public void setCreditDateTime(ISODateTime creditDateTime) {
		this.creditDateTime = creditDateTime;
	}

	public PaymentInstruction getRelatedPaymentInstruction() {
		return relatedPaymentInstruction;
	}

	public void setRelatedPaymentInstruction(com.tools20022.repository.entity.PaymentInstruction relatedPaymentInstruction) {
		this.relatedPaymentInstruction = relatedPaymentInstruction;
	}

	public SettlementMethodCode getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(SettlementMethodCode settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public CashAccount getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(com.tools20022.repository.entity.CashAccount settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public ISODateTime getDebitDateTime() {
		return debitDateTime;
	}

	public void setDebitDateTime(ISODateTime debitDateTime) {
		this.debitDateTime = debitDateTime;
	}

	public List<CashSettlementInstructionPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.CashSettlementInstructionPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<TransactionAdministrator> getRelatedTransactionAdministrator() {
		return relatedTransactionAdministrator;
	}

	public void setRelatedTransactionAdministrator(List<com.tools20022.repository.entity.TransactionAdministrator> relatedTransactionAdministrator) {
		this.relatedTransactionAdministrator = relatedTransactionAdministrator;
	}

	public BookEntry getBookEntry() {
		return bookEntry;
	}

	public void setBookEntry(com.tools20022.repository.entity.BookEntry bookEntry) {
		this.bookEntry = bookEntry;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(com.tools20022.repository.entity.Reservation reservation) {
		this.reservation = reservation;
	}
}