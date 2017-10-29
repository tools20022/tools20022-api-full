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
 * {@linkplain com.tools20022.repository.entity.CashSettlement#InterbankSettlementAmount
 * CashSettlement.InterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#InterbankSettlementDate
 * CashSettlement.InterbankSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#RTGS
 * CashSettlement.RTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#CreditDateTime
 * CashSettlement.CreditDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedPaymentInstruction
 * CashSettlement.RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementMethod
 * CashSettlement.SettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
 * CashSettlement.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#DebitDateTime
 * CashSettlement.DebitDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#PartyRole
 * CashSettlement.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedTransactionAdministrator
 * CashSettlement.RelatedTransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#BookEntry
 * CashSettlement.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#RelatedInvestigationCase
 * CashSettlement.RelatedInvestigationCase}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#Reservation
 * CashSettlement.Reservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedSettlementInstruction
 * CashAccount.RelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#SettlementInstruction
 * PaymentInstruction.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#SettlementInstruction
 * TransactionAdministrator.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#SettlementInstruction
 * Reservation.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#RelatedSettlementInstruction
 * BookEntry.RelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#SettlementInstruction
 * CashSettlementInstructionPartyRole.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#CoverCorrection
 * PaymentInvestigationCaseResolution.CoverCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#SettlementInformation
 * RequestedModification3.SettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#SettlementInformation
 * RequestedModification4.SettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#SettlementInformation
 * RequestedModification5.SettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#SettlementInformation
 * RequestedModification6.SettlementInformation}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#InterbankSettlementAmount
	 * PaymentInstructionReference1Details.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#InterbankSettlementAmount
	 * PaymentInstructionReference2Details.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#InterbankSettlementAmount
	 * PaymentInstructionReferenceDetails3.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#InterbankSettlementAmount
	 * PaymentInstructionReferenceDetails4.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#InterBankSettlementAmount
	 * LongPaymentIdentification1.InterBankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#InterbankSettlementAmount
	 * PaymentSearch2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#InterbankSettlementAmount
	 * PaymentSearch3.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#InterbankSettlementAmount
	 * PaymentSearch4.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#InterbankSettlementAmount
	 * PaymentDetails5.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#InterbankSettlementAmount
	 * PaymentDetails6.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#InterbankSettlementAmount
	 * PaymentDetails7.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#InterbankSettlementAmount
	 * PaymentInstruction1.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#InterbankSettlementAmount
	 * OriginalTransactionReference1.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation3.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#InterbankSettlementAmount
	 * OriginalTransactionReference13.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#InterbankSettlementAmount
	 * OriginalTransactionReference16.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#TotalInterbankSettlementAmount
	 * GroupHeader2.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#InterbankSettlementAmount
	 * CreditTransferTransactionInformation2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#TotalInterbankSettlementAmount
	 * GroupHeader33.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#InterbankSettlementAmount
	 * CreditTransferTransactionInformation11.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#TotalInterbankSettlementAmount
	 * GroupHeader49.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#InterbankSettlementAmount
	 * CreditTransferTransaction2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#InterbankSettlementAmount
	 * CreditTransferTransaction7.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#TotalInterbankSettlementAmount
	 * GroupHeader3.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#InterbankSettlementAmount
	 * DirectDebitTransactionInformation2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#TotalInterbankSettlementAmount
	 * GroupHeader34.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#InterbankSettlementAmount
	 * DirectDebitTransactionInformation10.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#TotalInterbankSettlementAmount
	 * GroupHeader50.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#InterbankSettlementAmount
	 * DirectDebitTransactionInformation12.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#InterbankSettlementAmount
	 * DirectDebitTransactionInformation14.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation31.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalInterbankSettlementAmount
	 * PaymentTransaction38.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalInterbankSettlementAmount
	 * PaymentTransaction48.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#TotalReversedInterbankSettlementAmount
	 * GroupHeader9.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation5.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#ReversedInterbankSettlementAmount
	 * PaymentTransactionInformation5.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#TotalReversedInterbankSettlementAmount
	 * GroupHeader41.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation29.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#ReversedInterbankSettlementAmount
	 * PaymentTransactionInformation29.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#TotalReversedInterbankSettlementAmount
	 * GroupHeader57.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#OriginalInterbankSettlementAmount
	 * PaymentTransaction36.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#ReversedInterbankSettlementAmount
	 * PaymentTransaction36.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#OriginalInterbankSettlementAmount
	 * PaymentTransaction45.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#ReversedInterbankSettlementAmount
	 * PaymentTransaction45.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#TotalInterbankSettlementAmount
	 * GroupHeader4.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#InterbankSettlementAmount
	 * CreditTransferTransactionInformation3.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#TotalInterbankSettlementAmount
	 * GroupHeader35.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#InterbankSettlementAmount
	 * CreditTransferTransactionInformation13.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#TotalInterbankSettlementAmount
	 * GroupHeader51.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#InterbankSettlementAmount
	 * CreditTransferTransaction4.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#InterbankSettlementAmount
	 * CreditTransferTransaction8.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#TotalReturnedInterbankSettlementAmount
	 * GroupHeader6.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation2.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation2.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#TotalReturnedInterbankSettlementAmount
	 * GroupHeader38.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation27.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation27.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#TotalReturnedInterbankSettlementAmount
	 * GroupHeader54.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalInterbankSettlementAmount
	 * PaymentTransaction34.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#ReturnedInterbankSettlementAmount
	 * PaymentTransaction34.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalInterbankSettlementAmount
	 * PaymentTransaction44.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#ReturnedInterbankSettlementAmount
	 * PaymentTransaction44.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#InterbankSettlementAmount
	 * OriginalTransactionReference15.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#InterbankSettlementAmount
	 * OriginalTransactionReference17.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#InterbankSettledAmount
	 * RequestedModification.InterbankSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#InterbankSettlementAmount
	 * PaymentInstructionExtract2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#ReturnedInterbankSettlementAmount
	 * ReturnInformation1.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#InterbankSettlementAmount
	 * CorrectivePaymentInstructionExtract.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#OriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction1.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#InterbankSettlementAmount
	 * RequestedModification2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#InterbankSettlementAmount
	 * PaymentComplementaryInformation2.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#InterbankSettlementAmount
	 * ResolutionInformation1.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation33.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#InterbankSettlementAmount
	 * CorrectiveInterbankTransaction1.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction2.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#InterbankSettlementAmount
	 * PaymentComplementaryInformation3.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalInterbankSettlementAmount
	 * PaymentTransaction40.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#InterbankSettlementAmount
	 * RequestedModification3.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#InterbankSettlementAmount
	 * DirectDebitTransactionInformation15.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#TotalInterbankSettlementAmount
	 * CreditTransferTransaction9.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation13.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation13.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation18.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation18.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#InterbankSettlementAmount
	 * OriginalTransactionReference9.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#InterbankSettlementAmount
	 * OriginalTransactionReference12.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#InterbankSettlementAmount
	 * OriginalTransactionReference8.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#InterbankSettlementAmount
	 * OriginalTransactionReference11.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation14.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#ReversedInterbankSettlementAmount
	 * PaymentTransactionInformation14.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation20.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#ReversedInterbankSettlementAmount
	 * PaymentTransactionInformation20.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation16.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation16.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation23.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation23.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation17.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#ReversedInterbankSettlementAmount
	 * PaymentTransactionInformation17.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation24.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#ReversedInterbankSettlementAmount
	 * PaymentTransactionInformation24.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#OriginalInterbankSettlementAmount
	 * PaymentTransactionInformation21.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#ReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation21.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#InterbankSettlementAmount
	 * CreditTransferTransactionInformation6.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#InterbankSettlementAmount
	 * CreditTransferTransactionInformation8.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#InterbankSettlementAmount
	 * CreditTransferTransactionInformation7.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#InterbankSettlementAmount
	 * CreditTransferTransactionInformation9.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#TotalInterbankSettlementAmount
	 * GroupHeader19.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#TotalInterbankSettlementAmount
	 * GroupHeader24.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#TotalInterbankSettlementAmount
	 * GroupHeader20.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#TotalInterbankSettlementAmount
	 * GroupHeader25.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#TotalInterbankSettlementAmount
	 * GroupHeader15.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#TotalInterbankSettlementAmount
	 * GroupHeader26.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#TotalReturnedInterbankSettlementAmount
	 * GroupHeader17.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#TotalReturnedInterbankSettlementAmount
	 * GroupHeader27.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#TotalReversedInterbankSettlementAmount
	 * GroupHeader22.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#TotalReversedInterbankSettlementAmount
	 * GroupHeader28.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#TotalInterbankSettlementAmount
	 * GroupHeader16.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#TotalInterbankSettlementAmount
	 * GroupHeader29.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#TotalReversedInterbankSettlementAmount
	 * GroupHeader18.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#TotalReversedInterbankSettlementAmount
	 * GroupHeader30.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#InterbankSettlementAmount
	 * DirectDebitTransactionInformation5.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#InterbankSettlementAmount
	 * DirectDebitTransactionInformation7.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#InterbankSettlementAmount
	 * DirectDebitTransactionInformation6.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#InterbankSettlementAmount
	 * DirectDebitTransactionInformation8.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#TotalReturnedInterbankSettlementAmount
	 * GroupHeader21.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#InterbankSettlementAmount
	 * PaymentSearch5.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#InterbankSettlementAmount
	 * PaymentInstruction14.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#InterbankSettlementAmount
	 * PaymentComplementaryInformation4.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalInterbankSettlementAmount
	 * PaymentTransaction50.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#ReturnedInterbankSettlementAmount
	 * PaymentTransaction50.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#InterbankSettlementAmount
	 * CreditTransferTransaction17.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#InterbankSettlementAmount
	 * CreditTransferTransaction19.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#InterbankSettlementAmount
	 * DirectDebitTransactionInformation17.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalInterbankSettlementAmount
	 * PaymentTransaction51.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#ReversedInterbankSettlementAmount
	 * PaymentTransaction51.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#InterbankSettlementAmount
	 * RequestedModification4.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalInterbankSettlementAmount
	 * PaymentTransaction53.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#InterbankSettlementAmount
	 * OriginalTransactionReference20.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalInterbankSettlementAmount
	 * PaymentTransaction55.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#UpFrontPayment
	 * SecuritiesTransaction1.UpFrontPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InterbankSettlementAmount
	 * CreditTransferTransaction23.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#TotalInterbankSettlementAmount
	 * GroupHeader70.TotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#InterbankSettlementAmount
	 * RequestedModification5.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InterbankSettlementAmount
	 * CreditTransferTransaction25.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#TotalReturnedInterbankSettlementAmount
	 * GroupHeader72.TotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalInterbankSettlementAmount
	 * PaymentTransaction65.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#ReturnedInterbankSettlementAmount
	 * PaymentTransaction65.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#InterbankSettlementAmount
	 * PaymentComplementaryInformation5.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#InterbankSettlementAmount
	 * DirectDebitTransactionInformation20.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalInterbankSettlementAmount
	 * PaymentTransaction60.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#ReversedInterbankSettlementAmount
	 * PaymentTransaction60.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#TotalReversedInterbankSettlementAmount
	 * GroupHeader71.TotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#InterbankSettlementAmount
	 * OriginalTransactionReference22.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalInterbankSettlementAmount
	 * PaymentTransaction67.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalInterbankSettlementAmount
	 * PaymentTransaction62.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InterbankSettlementAmount
	 * DirectDebitTransactionInformation21.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalInterbankSettlementAmount
	 * PaymentTransaction81.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ReversedInterbankSettlementAmount
	 * PaymentTransaction81.ReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InterbankSettlementAmount
	 * RequestedModification6.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalInterbankSettlementAmount
	 * PaymentTransaction76.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ReturnedInterbankSettlementAmount
	 * PaymentTransaction76.ReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#InterbankSettlementAmount
	 * OriginalTransactionReference24.InterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalInterbankSettlementAmount
	 * PaymentTransaction75.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalInterbankSettlementAmount
	 * PaymentTransaction79.OriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InterbankSettlementAmount
	 * PaymentComplementaryInformation6.InterbankSettlementAmount}</li>
	 * </ul>
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
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterbankSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstructionReference2Details.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.InterbankSettlementAmount,
					com.tools20022.repository.msg.LongPaymentIdentification1.InterBankSettlementAmount, com.tools20022.repository.msg.PaymentSearch2.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentSearch3.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentSearch4.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentDetails5.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentDetails6.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentDetails7.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentInstruction1.InterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference1.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference13.InterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference16.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader2.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader33.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader49.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction2.InterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction7.InterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader3.TotalInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation2.InterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader34.TotalInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation10.InterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader50.TotalInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation12.InterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction38.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction48.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader9.TotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation5.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation5.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader41.TotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation29.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation29.ReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader57.TotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction36.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction36.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction45.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction45.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader4.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader35.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader51.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction4.InterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction8.InterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader6.TotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation2.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation2.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader38.TotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation27.ReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader54.TotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction34.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction34.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction44.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction44.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference15.InterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference17.InterbankSettlementAmount, com.tools20022.repository.msg.RequestedModification.InterbankSettledAmount,
					com.tools20022.repository.msg.PaymentInstructionExtract2.InterbankSettlementAmount, com.tools20022.repository.msg.ReturnInformation1.ReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.InterbankSettlementAmount, com.tools20022.repository.msg.UnderlyingPaymentTransaction1.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification2.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentComplementaryInformation2.InterbankSettlementAmount,
					com.tools20022.repository.msg.ResolutionInformation1.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.InterbankSettlementAmount, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction40.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification3.InterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation15.InterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction9.TotalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation13.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation13.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation18.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation18.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference9.InterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference12.InterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference8.InterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference11.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation14.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation14.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation20.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation20.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation16.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation16.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation23.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation23.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation17.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation17.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation24.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation21.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation21.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation6.InterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation8.InterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation7.InterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader19.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader24.TotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader20.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader25.TotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader15.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader26.TotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader17.TotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader27.TotalReturnedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader22.TotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader28.TotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader16.TotalInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader29.TotalInterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader18.TotalReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader30.TotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation5.InterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation7.InterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation6.InterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader21.TotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentSearch5.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstruction14.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction50.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction50.ReturnedInterbankSettlementAmount, com.tools20022.repository.msg.CreditTransferTransaction17.InterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction19.InterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation17.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction51.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction51.ReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.RequestedModification4.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction53.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference20.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction55.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.SecuritiesTransaction1.UpFrontPayment, com.tools20022.repository.msg.CreditTransferTransaction23.InterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader70.TotalInterbankSettlementAmount, com.tools20022.repository.msg.RequestedModification5.InterbankSettlementAmount,
					com.tools20022.repository.msg.CreditTransferTransaction25.InterbankSettlementAmount, com.tools20022.repository.msg.GroupHeader72.TotalReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction65.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction65.ReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.InterbankSettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation20.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction60.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction60.ReversedInterbankSettlementAmount,
					com.tools20022.repository.msg.GroupHeader71.TotalReversedInterbankSettlementAmount, com.tools20022.repository.msg.OriginalTransactionReference22.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction67.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction62.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction81.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction81.ReversedInterbankSettlementAmount, com.tools20022.repository.msg.RequestedModification6.InterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction76.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction76.ReturnedInterbankSettlementAmount,
					com.tools20022.repository.msg.OriginalTransactionReference24.InterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction75.OriginalInterbankSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentComplementaryInformation6.InterbankSettlementAmount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#InterbankValueDate
	 * PaymentInstructionReference1Details.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#InterbankValueDate
	 * PaymentInstructionReference2Details.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#InterbankValueDate
	 * PaymentInstructionReferenceDetails3.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#InterbankValueDate
	 * PaymentInstructionReferenceDetails4.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#InterBankSettlementDate
	 * LongPaymentIdentification1.InterBankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#InterBankSettlementDate
	 * ShortPaymentIdentification1.InterBankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#InterbankSettlementDate
	 * PaymentSearch4.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#InterbankValueDate
	 * PaymentDetails5.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#InterbankValueDate
	 * PaymentDetails6.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#InterbankValueDate
	 * PaymentDetails7.InterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#InterbankSettlementDate
	 * PaymentInstruction1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#InterbankSettlementDate
	 * TransactionDates1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#InterbankSettlementDate
	 * TransactionDates2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#InterbankSettlementDate
	 * OriginalTransactionReference1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#InterbankSettlementDate
	 * OriginalTransactionReference13.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#InterbankSettlementDate
	 * OriginalTransactionReference16.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#InterbankSettlementDate
	 * GroupHeader2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#InterbankSettlementDate
	 * CreditTransferTransactionInformation2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#InterbankSettlementDate
	 * GroupHeader33.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#InterbankSettlementDate
	 * CreditTransferTransactionInformation11.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#InterbankSettlementDate
	 * GroupHeader49.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#InterbankSettlementDate
	 * CreditTransferTransaction2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#InterbankSettlementDate
	 * CreditTransferTransaction7.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#InterbankSettlementDate
	 * GroupHeader3.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#InterbankSettlementDate
	 * DirectDebitTransactionInformation2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#InterbankSettlementDate
	 * GroupHeader34.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#InterbankSettlementDate
	 * DirectDebitTransactionInformation10.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#InterbankSettlementDate
	 * GroupHeader50.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#InterbankSettlementDate
	 * DirectDebitTransactionInformation12.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#InterbankSettlementDate
	 * DirectDebitTransactionInformation14.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalInterbankSettlementDate
	 * PaymentTransaction38.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalInterbankSettlementDate
	 * PaymentTransaction48.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#InterbankSettlementDate
	 * GroupHeader9.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#InterbankSettlementDate
	 * PaymentTransactionInformation5.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#InterbankSettlementDate
	 * GroupHeader41.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#InterbankSettlementDate
	 * PaymentTransactionInformation29.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#InterbankSettlementDate
	 * GroupHeader57.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#InterbankSettlementDate
	 * PaymentTransaction36.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#InterbankSettlementDate
	 * PaymentTransaction45.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#InterbankSettlementDate
	 * GroupHeader4.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#InterbankSettlementDate
	 * CreditTransferTransactionInformation3.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#InterbankSettlementDate
	 * GroupHeader35.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#InterbankSettlementDate
	 * CreditTransferTransactionInformation13.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#InterbankSettlementDate
	 * GroupHeader51.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#InterbankSettlementDate
	 * CreditTransferTransaction4.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#InterbankSettlementDate
	 * CreditTransferTransaction8.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#InterbankSettlementDate
	 * GroupHeader6.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#InterbankSettlementDate
	 * PaymentTransactionInformation2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#InterbankSettlementDate
	 * GroupHeader38.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#InterbankSettlementDate
	 * PaymentTransactionInformation27.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#InterbankSettlementDate
	 * GroupHeader54.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#InterbankSettlementDate
	 * PaymentTransaction34.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#InterbankSettlementDate
	 * PaymentTransaction44.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#InterbankSettlementDate
	 * OriginalTransactionReference15.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#InterbankSettlementDate
	 * OriginalTransactionReference17.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#SettlementDate
	 * CashInForecast2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#SettlementDate
	 * CashOutForecast2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#CashSettlementDate
	 * CashInForecast4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#CashSettlementDate
	 * CashOutForecast4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#SettlementDate
	 * CashInForecast1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#SettlementDate
	 * CashOutForecast1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#CashSettlementDate
	 * CashInForecast3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#CashSettlementDate
	 * CashOutForecast3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#InterbankSettlementDate
	 * PaymentInstructionExtract2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#InterbankSettlementDate
	 * ReturnInformation1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#InterbankSettlementDate
	 * CorrectivePaymentInstructionExtract.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#OriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction1.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#InterbankSettlementDate
	 * RequestedModification2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#InterbankSettlementDate
	 * PaymentComplementaryInformation2.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#InterbankSettlementDate
	 * ResolutionInformation1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalInterbankSettlementDate
	 * PaymentTransactionInformation33.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#InterbankSettlementDate
	 * CorrectiveInterbankTransaction1.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#OriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction2.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#InterbankSettlementDate
	 * PaymentComplementaryInformation3.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalInterbankSettlementDate
	 * PaymentTransaction40.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#InterbankSettlementDate
	 * RequestedModification3.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#InterbankSettlementDate
	 * DirectDebitTransactionInformation15.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#InterbankSettlementDate
	 * CreditTransferTransaction9.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#InterbankSettlementDate
	 * OriginalTransactionReference7.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#InterbankSettlementDate
	 * OriginalTransactionReference10.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#InterbankSettlementDate
	 * OriginalTransactionReference9.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#InterbankSettlementDate
	 * OriginalTransactionReference12.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#InterbankSettlementDate
	 * OriginalTransactionReference8.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#InterbankSettlementDate
	 * OriginalTransactionReference11.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#InterbankSettlementDate
	 * PaymentTransactionInformation16.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#InterbankSettlementDate
	 * PaymentTransactionInformation17.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#InterbankSettlementDate
	 * PaymentTransactionInformation21.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#InterbankSettlementDate
	 * CreditTransferTransactionInformation7.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#InterbankSettlementDate
	 * GroupHeader19.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#InterbankSettlementDate
	 * GroupHeader24.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#InterbankSettlementDate
	 * GroupHeader20.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#InterbankSettlementDate
	 * GroupHeader25.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#InterbankSettlementDate
	 * GroupHeader15.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#InterbankSettlementDate
	 * GroupHeader26.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#InterbankSettlementDate
	 * GroupHeader17.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#InterbankSettlementDate
	 * GroupHeader27.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#InterbankSettlementDate
	 * GroupHeader22.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#InterbankSettlementDate
	 * GroupHeader28.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#InterbankSettlementDate
	 * GroupHeader16.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#InterbankSettlementDate
	 * GroupHeader29.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#InterbankSettlementDate
	 * GroupHeader18.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#InterbankSettlementDate
	 * GroupHeader30.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#InterbankSettlementDate
	 * DirectDebitTransactionInformation6.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#InterbankSettlementDate
	 * GroupHeader21.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#SettlementDate
	 * IntraBalance2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1#SettlementDate
	 * IntraBalance1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#InterbankSettlementDate
	 * PaymentSearch5.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#InterbankSettlementDate
	 * PaymentInstruction14.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#CashSettlementDate
	 * CashOutForecast5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#CashSettlementDate
	 * CashInForecast5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#CashSettlementDate
	 * CashOutForecast6.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#CashSettlementDate
	 * CashInForecast6.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#InterbankSettlementDate
	 * PaymentComplementaryInformation4.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#InterbankSettlementDate
	 * PaymentTransaction50.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#InterbankSettlementDate
	 * CreditTransferTransaction17.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#InterbankSettlementDate
	 * CreditTransferTransaction19.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#InterbankSettlementDate
	 * DirectDebitTransactionInformation17.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#InterbankSettlementDate
	 * PaymentTransaction51.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#InterbankSettlementDate
	 * RequestedModification4.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalInterbankSettlementDate
	 * PaymentTransaction53.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#InterbankSettlementDate
	 * OriginalTransactionReference20.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalInterbankSettlementDate
	 * PaymentTransaction55.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInOutForecast7#CashSettlementDate
	 * CashInOutForecast7.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InterbankSettlementDate
	 * CreditTransferTransaction23.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#InterbankSettlementDate
	 * GroupHeader70.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#InterbankSettlementDate
	 * RequestedModification5.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InterbankSettlementDate
	 * CreditTransferTransaction25.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#InterbankSettlementDate
	 * GroupHeader72.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#InterbankSettlementDate
	 * PaymentTransaction65.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#InterbankSettlementDate
	 * PaymentComplementaryInformation5.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#InterbankSettlementDate
	 * DirectDebitTransactionInformation20.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#InterbankSettlementDate
	 * PaymentTransaction60.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#InterbankSettlementDate
	 * GroupHeader71.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#InterbankSettlementDate
	 * OriginalTransactionReference22.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalInterbankSettlementDate
	 * PaymentTransaction67.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalInterbankSettlementDate
	 * PaymentTransaction62.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InterbankSettlementDate
	 * DirectDebitTransactionInformation21.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#InterbankSettlementDate
	 * PaymentTransaction81.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InterbankSettlementDate
	 * RequestedModification6.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#InterbankSettlementDate
	 * PaymentTransaction76.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#InterbankSettlementDate
	 * OriginalTransactionReference24.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalInterbankSettlementDate
	 * PaymentTransaction75.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalInterbankSettlementDate
	 * PaymentTransaction79.OriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InterbankSettlementDate
	 * PaymentComplementaryInformation6.InterbankSettlementDate}</li>
	 * </ul>
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
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterbankSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.InterbankValueDate, com.tools20022.repository.msg.PaymentInstructionReference2Details.InterbankValueDate,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.InterbankValueDate, com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.InterbankValueDate,
					com.tools20022.repository.msg.LongPaymentIdentification1.InterBankSettlementDate, com.tools20022.repository.msg.ShortPaymentIdentification1.InterBankSettlementDate,
					com.tools20022.repository.msg.PaymentSearch4.InterbankSettlementDate, com.tools20022.repository.msg.PaymentDetails5.InterbankValueDate, com.tools20022.repository.msg.PaymentDetails6.InterbankValueDate,
					com.tools20022.repository.msg.PaymentDetails7.InterbankValueDate, com.tools20022.repository.msg.PaymentInstruction1.InterbankSettlementDate, com.tools20022.repository.msg.TransactionDates1.InterbankSettlementDate,
					com.tools20022.repository.msg.TransactionDates2.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference1.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference13.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference16.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader2.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransactionInformation2.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader33.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransactionInformation11.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader49.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction2.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction7.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader3.InterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader34.InterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader50.InterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.InterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation14.InterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction38.OriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction48.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader9.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation5.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader41.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation29.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader57.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction36.InterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction45.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader4.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader35.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader51.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction4.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction8.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader6.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation2.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader38.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation27.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader54.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction34.InterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction44.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference15.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference17.InterbankSettlementDate, com.tools20022.repository.msg.CashInForecast2.SettlementDate, com.tools20022.repository.msg.CashOutForecast2.SettlementDate,
					com.tools20022.repository.msg.CashInForecast4.CashSettlementDate, com.tools20022.repository.msg.CashOutForecast4.CashSettlementDate, com.tools20022.repository.msg.CashInForecast1.SettlementDate,
					com.tools20022.repository.msg.CashOutForecast1.SettlementDate, com.tools20022.repository.msg.CashInForecast3.CashSettlementDate, com.tools20022.repository.msg.CashOutForecast3.CashSettlementDate,
					com.tools20022.repository.msg.PaymentInstructionExtract2.InterbankSettlementDate, com.tools20022.repository.msg.ReturnInformation1.InterbankSettlementDate,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.InterbankSettlementDate, com.tools20022.repository.msg.UnderlyingPaymentTransaction1.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification2.InterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation2.InterbankSettlementDate,
					com.tools20022.repository.msg.ResolutionInformation1.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.InterbankSettlementDate, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction40.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification3.InterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation15.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction9.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference7.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference10.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference9.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference12.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference8.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference11.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation16.InterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransactionInformation17.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransactionInformation21.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader19.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader24.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader20.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader25.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader15.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader26.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader17.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader27.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader22.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader28.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader16.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader29.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader18.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader30.InterbankSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation6.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader21.InterbankSettlementDate, com.tools20022.repository.msg.IntraBalance2.SettlementDate, com.tools20022.repository.msg.IntraBalance1.SettlementDate,
					com.tools20022.repository.msg.PaymentSearch5.InterbankSettlementDate, com.tools20022.repository.msg.PaymentInstruction14.InterbankSettlementDate, com.tools20022.repository.msg.CashOutForecast5.CashSettlementDate,
					com.tools20022.repository.msg.CashInForecast5.CashSettlementDate, com.tools20022.repository.msg.CashOutForecast6.CashSettlementDate, com.tools20022.repository.msg.CashInForecast6.CashSettlementDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction50.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction17.InterbankSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction19.InterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction51.InterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification4.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction53.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference20.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction55.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.CashInOutForecast7.CashSettlementDate, com.tools20022.repository.msg.CreditTransferTransaction23.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader70.InterbankSettlementDate, com.tools20022.repository.msg.RequestedModification5.InterbankSettlementDate,
					com.tools20022.repository.msg.CreditTransferTransaction25.InterbankSettlementDate, com.tools20022.repository.msg.GroupHeader72.InterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction65.InterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation5.InterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction60.InterbankSettlementDate,
					com.tools20022.repository.msg.GroupHeader71.InterbankSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference22.InterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction67.OriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction62.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction81.InterbankSettlementDate,
					com.tools20022.repository.msg.RequestedModification6.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction76.InterbankSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference24.InterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction75.OriginalInterbankSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalInterbankSettlementDate, com.tools20022.repository.msg.PaymentComplementaryInformation6.InterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#RTGS
	 * PaymentStatusCode5Choice.RTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#RTGS
	 * PaymentStatusCode6Choice.RTGS}</li>
	 * </ul>
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
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the RTGS status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RTGS = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCode5Choice.RTGS, com.tools20022.repository.choice.PaymentStatusCode6Choice.RTGS);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#CreditDateTime
	 * SettlementDateTimeIndication1.CreditDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalInterbankSettlementDate
	 * PaymentTransactionInformation31.OriginalInterbankSettlementDate}</li>
	 * </ul>
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
	 * name} = "CreditDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the credit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.CreditDateTime, com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalInterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * PaymentInstruction which is the source of the settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#SettlementInstruction
	 * PaymentInstruction.SettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd RelatedPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#SettlementMethod
	 * SettlementInformation3.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#SettlementMethod
	 * SettlementInformation1.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#SettlementMethod
	 * SettlementInformation13.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#SettlementMethod
	 * SettlementInstruction4.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#SettlementMethod
	 * SettlementInstruction1.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#SettlementMethod
	 * SettlementInformation2.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#SettlementMethod
	 * SettlementInformation14.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#SettlementMethod
	 * SettlementInstruction2.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#SettlementMethod
	 * SettlementInformation16.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#SettlementMethod
	 * SettlementInformation10.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#SettlementMethod
	 * SettlementInformation6.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#SettlementMethod
	 * SettlementInformation11.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#SettlementMethod
	 * SettlementInformation12.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#SettlementMethod
	 * SettlementInformation8.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#SettlementMethod
	 * SettlementInformation9.SettlementMethod}</li>
	 * </ul>
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
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInformation3.SettlementMethod, com.tools20022.repository.msg.SettlementInformation1.SettlementMethod,
					com.tools20022.repository.msg.SettlementInformation13.SettlementMethod, com.tools20022.repository.msg.SettlementInstruction4.SettlementMethod, com.tools20022.repository.msg.SettlementInstruction1.SettlementMethod,
					com.tools20022.repository.msg.SettlementInformation2.SettlementMethod, com.tools20022.repository.msg.SettlementInformation14.SettlementMethod, com.tools20022.repository.msg.SettlementInstruction2.SettlementMethod,
					com.tools20022.repository.msg.SettlementInformation16.SettlementMethod, com.tools20022.repository.msg.SettlementInformation10.SettlementMethod, com.tools20022.repository.msg.SettlementInformation6.SettlementMethod,
					com.tools20022.repository.msg.SettlementInformation11.SettlementMethod, com.tools20022.repository.msg.SettlementInformation12.SettlementMethod, com.tools20022.repository.msg.SettlementInformation8.SettlementMethod,
					com.tools20022.repository.msg.SettlementInformation9.SettlementMethod);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}
	};
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedSettlementInstruction
	 * CashAccount.RelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#SettlementDetails
	 * LocalMarketAnnex2.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#SettlementAccount
	 * SettlementInformation3.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#SettlementAccount
	 * SettlementInformation1.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#SettlementAccount
	 * SettlementInformation13.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#SettlementAccount
	 * SettlementInstruction4.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#SettlementAccount
	 * SettlementInstruction1.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#SettlementAccount
	 * SettlementInformation2.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#SettlementAccount
	 * SettlementInformation14.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#SettlementAccount
	 * SettlementInstruction2.SettlementAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Demand1#SettlementAccount
	 * Demand1.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#SettlementAccount
	 * SettlementInformation16.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#NostroVostroAccount
	 * PaymentComplementaryInformation.NostroVostroAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInformation15#PaymentAccount
	 * PaymentInformation15.PaymentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#SettlementAccount
	 * SettlementInformation10.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#SettlementAccount
	 * SettlementInformation6.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#SettlementAccount
	 * SettlementInformation11.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#SettlementAccount
	 * SettlementInformation12.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#SettlementAccount
	 * SettlementInformation8.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#SettlementAccount
	 * SettlementInformation9.SettlementAccount}</li>
	 * </ul>
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
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex2.SettlementDetails, com.tools20022.repository.msg.SettlementInformation3.SettlementAccount,
					com.tools20022.repository.msg.SettlementInformation1.SettlementAccount, com.tools20022.repository.msg.SettlementInformation13.SettlementAccount, com.tools20022.repository.msg.SettlementInstruction4.SettlementAccount,
					com.tools20022.repository.msg.SettlementInstruction1.SettlementAccount, com.tools20022.repository.msg.SettlementInformation2.SettlementAccount, com.tools20022.repository.msg.SettlementInformation14.SettlementAccount,
					com.tools20022.repository.msg.SettlementInstruction2.SettlementAccount, com.tools20022.repository.msg.Demand1.SettlementAccount, com.tools20022.repository.msg.SettlementInformation16.SettlementAccount,
					com.tools20022.repository.msg.PaymentComplementaryInformation.NostroVostroAccount, com.tools20022.repository.msg.PaymentInformation15.PaymentAccount,
					com.tools20022.repository.msg.SettlementInformation10.SettlementAccount, com.tools20022.repository.msg.SettlementInformation6.SettlementAccount, com.tools20022.repository.msg.SettlementInformation11.SettlementAccount,
					com.tools20022.repository.msg.SettlementInformation12.SettlementAccount, com.tools20022.repository.msg.SettlementInformation8.SettlementAccount, com.tools20022.repository.msg.SettlementInformation9.SettlementAccount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#DebitDateTime
	 * SettlementDateTimeIndication1.DebitDateTime}</li>
	 * </ul>
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
	 * name} = "DebitDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the debit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DebitDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDateTimeIndication1.DebitDateTime);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies each role linked to the settlement of a payment and played by a
	 * party at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#SettlementInstruction
	 * CashSettlementInstructionPartyRole.SettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#CSDOrNCB
	 * BillingReport1.CSDOrNCB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#CSDOrNCB
	 * BillingSearchCriteria1.CSDOrNCB}</li>
	 * </ul>
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
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingReport1.CSDOrNCB, com.tools20022.repository.msg.BillingSearchCriteria1.CSDOrNCB);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction administrator which manages the related settlement
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#SettlementInstruction
	 * TransactionAdministrator.SettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd RelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			type_lazy = () -> TransactionAdministrator.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Movement of cash between two accounts in the same financial institution,
	 * resulting from the settlement of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#RelatedSettlementInstruction
	 * BookEntry.RelatedSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd BookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Case resolution which is the source of the correction of a settlement
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#CoverCorrection
	 * PaymentInvestigationCaseResolution.CoverCorrection}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Liquidity set aside by the payer for specific purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#SettlementInstruction
	 * Reservation.SettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd Reservation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction,
						com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction, com.tools20022.repository.entity.Reservation.SettlementInstruction,
						com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification3.SettlementInformation, com.tools20022.repository.msg.RequestedModification4.SettlementInformation,
						com.tools20022.repository.msg.RequestedModification5.SettlementInformation, com.tools20022.repository.msg.RequestedModification6.SettlementInformation);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlement.InterbankSettlementAmount, com.tools20022.repository.entity.CashSettlement.InterbankSettlementDate,
						com.tools20022.repository.entity.CashSettlement.RTGS, com.tools20022.repository.entity.CashSettlement.CreditDateTime, com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction,
						com.tools20022.repository.entity.CashSettlement.SettlementMethod, com.tools20022.repository.entity.CashSettlement.SettlementAccount, com.tools20022.repository.entity.CashSettlement.DebitDateTime,
						com.tools20022.repository.entity.CashSettlement.PartyRole, com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator, com.tools20022.repository.entity.CashSettlement.BookEntry,
						com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase, com.tools20022.repository.entity.CashSettlement.Reservation);
				derivationComponent_lazy = () -> Arrays.asList(SettlementInformation3.mmObject(), SettlementInformation1.mmObject(), SettlementInformation13.mmObject(), SettlementInstruction4.mmObject(),
						SettlementDateTimeIndication1.mmObject(), SettlementInstruction1.mmObject(), SettlementInformation2.mmObject(), SettlementInformation14.mmObject(), SettlementInstruction2.mmObject(),
						SettlementInformation16.mmObject(), PaymentSchemeChoice.mmObject(), ReturnInformation1.mmObject(), SettlementInformation15.mmObject(), ResolutionInformation1.mmObject(), SettlementTerms1.mmObject(),
						SettlementTerms2.mmObject(), SettlementInstruction3.mmObject(), SettlementInformation10.mmObject(), SettlementInformation6.mmObject(), SettlementInformation11.mmObject(), SettlementInformation12.mmObject(),
						SettlementInformation8.mmObject(), SettlementInformation9.mmObject(), SettlementTerms3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}