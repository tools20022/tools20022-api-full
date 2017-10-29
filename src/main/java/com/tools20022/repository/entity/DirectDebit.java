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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment, initiated by the creditor, to debit a debtor's account in favour of
 * the creditor. A direct debit can be pre-authorised or not. In most countries,
 * authorisation is in the form of a mandate between the debtor and creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DirectDebit" src="doc-files/DirectDebit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#RegistrationIdentification
 * DirectDebit.RegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
 * DirectDebit.DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#PreNotificationIdentification
 * DirectDebit.PreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#PreNotificationDate
 * DirectDebit.PreNotificationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#RelatedDirectDebit
 * DirectDebitMandate.RelatedDirectDebit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument7#DirectDebit
 * PaymentInstrument7.DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#DirectDebitDetails
 * PaymentInstrument8.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#DirectDebitDetails
 * PaymentInstrument17Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#DirectDebitTransaction
 * DirectDebitTransactionInformation1.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#DirectDebitTransactionInformation
 * PaymentInstructionInformation2.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#DirectDebitTransaction
 * DirectDebitTransactionInformation9.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#DirectDebitTransactionInformation
 * PaymentInstructionInformation4.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#DirectDebitTransaction
 * DirectDebitTransactionInformation11.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#DirectDebitTransactionInformation
 * PaymentInstruction7.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#DirectDebitTransaction
 * DirectDebitTransactionInformation13.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#DirectDebitTransactionInformation
 * PaymentInstruction10.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#DirectDebitTransaction
 * DirectDebitTransactionInformation2.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#DirectDebitTransaction
 * DirectDebitTransactionInformation10.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#DirectDebitTransaction
 * DirectDebitTransactionInformation12.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#DirectDebitTransaction
 * DirectDebitTransactionInformation14.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#DirectDebitDetails
 * PaymentInstrument9Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#DirectDebitDetails
 * PaymentInstrument10Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#DirectDebitDetails
 * PaymentInstrument6Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#DirectDebitDetails
 * PaymentInstrument8Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#DirectDebitDetails
 * PaymentInstrument12Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#DirectDebitTransactionInformation
 * CreditTransferTransaction9.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#DirectDebitTransaction
 * DirectDebitTransactionInformation5.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#DirectDebitTransaction
 * DirectDebitTransactionInformation7.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#DirectDebitTransaction
 * DirectDebitTransactionInformation6.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#DirectDebitTransaction
 * DirectDebitTransactionInformation8.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#DirectDebitTransaction
 * DirectDebitTransactionInformation17.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#DirectDebitTransactionInformation
 * PaymentInstruction15.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#DirectDebitTransaction
 * DirectDebitTransactionInformation18.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#DirectDebitTransactionInformation
 * PaymentInstruction18.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#DirectDebitTransaction
 * DirectDebitTransactionInformation20.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#DirectDebitTransaction
 * DirectDebitTransactionInformation19.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#DirectDebitDetails
 * PaymentInstrument18Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#DirectDebitDetails
 * PaymentInstrument20Choice.DirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#DirectDebitTransactionInformation
 * PaymentInstruction21.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#DirectDebitTransaction
 * DirectDebitTransactionInformation21.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#DirectDebitTransaction
 * DirectDebitTransactionInformation22.DirectDebitTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate2
 * DirectDebitMandate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate3
 * DirectDebitMandate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate4
 * DirectDebitMandate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction1
 * DirectDebitTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1
 * DirectDebitTransactionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction6
 * DirectDebitTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
 * DirectDebitTransactionInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction7
 * DirectDebitTransaction7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11
 * DirectDebitTransactionInformation11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13
 * DirectDebitTransactionInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2
 * DirectDebitTransactionInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10
 * DirectDebitTransactionInformation10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12
 * DirectDebitTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14
 * DirectDebitTransactionInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15
 * DirectDebitTransactionInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction4
 * DirectDebitTransaction4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5
 * DirectDebitTransactionInformation5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7
 * DirectDebitTransactionInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction5
 * DirectDebitTransaction5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6
 * DirectDebitTransactionInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8
 * DirectDebitTransactionInformation8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17
 * DirectDebitTransactionInformation17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction8
 * DirectDebitTransaction8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18
 * DirectDebitTransactionInformation18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20
 * DirectDebitTransactionInformation20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19
 * DirectDebitTransactionInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate5
 * DirectDebitMandate5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate6
 * DirectDebitMandate6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21
 * DirectDebitTransactionInformation21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22
 * DirectDebitTransactionInformation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction9
 * DirectDebitTransaction9}</li>
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
 * "DirectDebit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
 * </li>
 * </ul>
 */
public class DirectDebit extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference assigned to a creditor by its financial institution, or
	 * relevant authority, authorising the creditor to take part in a direct
	 * debit scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate2#RegistrationIdentification
	 * DirectDebitMandate2.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#RegistrationIdentification
	 * DirectDebitMandate3.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#RegistrationIdentification
	 * DirectDebitMandate4.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#RegistrationIdentification
	 * DirectDebitMandate5.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#RegistrationIdentification
	 * DirectDebitMandate6.RegistrationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitMandate2.RegistrationIdentification, com.tools20022.repository.msg.DirectDebitMandate3.RegistrationIdentification,
					com.tools20022.repository.msg.DirectDebitMandate4.RegistrationIdentification, com.tools20022.repository.msg.DirectDebitMandate5.RegistrationIdentification,
					com.tools20022.repository.msg.DirectDebitMandate6.RegistrationIdentification);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Set of elements providing information specific to the direct debit
	 * mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#RelatedDirectDebit
	 * DirectDebitMandate.RelatedDirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction1#MandateRelatedInformation
	 * DirectDebitTransaction1.MandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6#MandateRelatedInformation
	 * DirectDebitTransaction6.MandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#MandateRelatedInformation
	 * DirectDebitTransaction7.MandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction4#MandateRelatedInformation
	 * DirectDebitTransaction4.MandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction5#MandateRelatedInformation
	 * DirectDebitTransaction5.MandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#MandateRelatedInformation
	 * DirectDebitTransaction8.MandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#DirectDebitMandateIdentification
	 * PaymentTerms6.DirectDebitMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#MandateRelatedInformation
	 * DirectDebitTransaction9.MandateRelatedInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the direct debit mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DirectDebitMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction1.MandateRelatedInformation, com.tools20022.repository.msg.DirectDebitTransaction6.MandateRelatedInformation,
					com.tools20022.repository.msg.DirectDebitTransaction7.MandateRelatedInformation, com.tools20022.repository.msg.DirectDebitTransaction4.MandateRelatedInformation,
					com.tools20022.repository.msg.DirectDebitTransaction5.MandateRelatedInformation, com.tools20022.repository.msg.DirectDebitTransaction8.MandateRelatedInformation,
					com.tools20022.repository.msg.PaymentTerms6.DirectDebitMandateIdentification, com.tools20022.repository.msg.DirectDebitTransaction9.MandateRelatedInformation);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectDebitMandate";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identification of the pre-notification which is
	 * sent separately from the direct debit instruction. Usage: the direct
	 * debit pre-notification is used to reconcile separately sent collection
	 * information with the direct debit transaction information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction1#PreNotificationIdentification
	 * DirectDebitTransaction1.PreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6#PreNotificationIdentification
	 * DirectDebitTransaction6.PreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#PreNotificationIdentification
	 * DirectDebitTransaction7.PreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction5#PreNotificationIdentification
	 * DirectDebitTransaction5.PreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#PreNotificationIdentification
	 * DirectDebitTransaction8.PreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#PreNotificationIdentification
	 * DirectDebitTransaction9.PreNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction1.PreNotificationIdentification, com.tools20022.repository.msg.DirectDebitTransaction6.PreNotificationIdentification,
					com.tools20022.repository.msg.DirectDebitTransaction7.PreNotificationIdentification, com.tools20022.repository.msg.DirectDebitTransaction5.PreNotificationIdentification,
					com.tools20022.repository.msg.DirectDebitTransaction8.PreNotificationIdentification, com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationIdentification);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which the creditor notifies the debtor about the amount and date
	 * on which the direct debit instruction will be presented to the debtor's
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction1#PreNotificationDate
	 * DirectDebitTransaction1.PreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6#PreNotificationDate
	 * DirectDebitTransaction6.PreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#PreNotificationDate
	 * DirectDebitTransaction7.PreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction5#PreNotificationDate
	 * DirectDebitTransaction5.PreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#PreNotificationDate
	 * DirectDebitTransaction8.PreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#PreNotificationDate
	 * DirectDebitTransaction9.PreNotificationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreNotificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction1.PreNotificationDate, com.tools20022.repository.msg.DirectDebitTransaction6.PreNotificationDate,
					com.tools20022.repository.msg.DirectDebitTransaction7.PreNotificationDate, com.tools20022.repository.msg.DirectDebitTransaction5.PreNotificationDate,
					com.tools20022.repository.msg.DirectDebitTransaction8.PreNotificationDate, com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationDate);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebit";
				definition = "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument7.DirectDebit, com.tools20022.repository.msg.PaymentInstrument8.DirectDebitDetails,
						com.tools20022.repository.choice.PaymentInstrument17Choice.DirectDebitDetails, com.tools20022.repository.msg.DirectDebitTransactionInformation1.DirectDebitTransaction,
						com.tools20022.repository.msg.PaymentInstructionInformation2.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation9.DirectDebitTransaction,
						com.tools20022.repository.msg.PaymentInstructionInformation4.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation11.DirectDebitTransaction,
						com.tools20022.repository.msg.PaymentInstruction7.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation13.DirectDebitTransaction,
						com.tools20022.repository.msg.PaymentInstruction10.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation2.DirectDebitTransaction,
						com.tools20022.repository.msg.DirectDebitTransactionInformation10.DirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation12.DirectDebitTransaction,
						com.tools20022.repository.msg.DirectDebitTransactionInformation14.DirectDebitTransaction, com.tools20022.repository.choice.PaymentInstrument9Choice.DirectDebitDetails,
						com.tools20022.repository.choice.PaymentInstrument10Choice.DirectDebitDetails, com.tools20022.repository.choice.PaymentInstrument6Choice.DirectDebitDetails,
						com.tools20022.repository.choice.PaymentInstrument8Choice.DirectDebitDetails, com.tools20022.repository.choice.PaymentInstrument12Choice.DirectDebitDetails,
						com.tools20022.repository.msg.CreditTransferTransaction9.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation5.DirectDebitTransaction,
						com.tools20022.repository.msg.DirectDebitTransactionInformation7.DirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation6.DirectDebitTransaction,
						com.tools20022.repository.msg.DirectDebitTransactionInformation8.DirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation17.DirectDebitTransaction,
						com.tools20022.repository.msg.PaymentInstruction15.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation18.DirectDebitTransaction,
						com.tools20022.repository.msg.PaymentInstruction18.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation20.DirectDebitTransaction,
						com.tools20022.repository.msg.DirectDebitTransactionInformation19.DirectDebitTransaction, com.tools20022.repository.choice.PaymentInstrument18Choice.DirectDebitDetails,
						com.tools20022.repository.choice.PaymentInstrument20Choice.DirectDebitDetails, com.tools20022.repository.msg.PaymentInstruction21.DirectDebitTransactionInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation21.DirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DirectDebitTransaction);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.RegistrationIdentification, com.tools20022.repository.entity.DirectDebit.DirectDebitMandate,
						com.tools20022.repository.entity.DirectDebit.PreNotificationIdentification, com.tools20022.repository.entity.DirectDebit.PreNotificationDate);
				derivationComponent_lazy = () -> Arrays.asList(DirectDebitMandate2.mmObject(), DirectDebitMandate3.mmObject(), DirectDebitMandate4.mmObject(), DirectDebitTransaction1.mmObject(),
						DirectDebitTransactionInformation1.mmObject(), DirectDebitTransaction6.mmObject(), DirectDebitTransactionInformation9.mmObject(), DirectDebitTransaction7.mmObject(), DirectDebitTransactionInformation11.mmObject(),
						DirectDebitTransactionInformation13.mmObject(), DirectDebitTransactionInformation2.mmObject(), DirectDebitTransactionInformation10.mmObject(), DirectDebitTransactionInformation12.mmObject(),
						DirectDebitTransactionInformation14.mmObject(), DirectDebitTransactionInformation15.mmObject(), DirectDebitTransaction4.mmObject(), DirectDebitTransactionInformation5.mmObject(),
						DirectDebitTransactionInformation7.mmObject(), DirectDebitTransaction5.mmObject(), DirectDebitTransactionInformation6.mmObject(), DirectDebitTransactionInformation8.mmObject(),
						DirectDebitTransactionInformation17.mmObject(), DirectDebitTransaction8.mmObject(), DirectDebitTransactionInformation18.mmObject(), DirectDebitTransactionInformation20.mmObject(),
						DirectDebitTransactionInformation19.mmObject(), DirectDebitMandate5.mmObject(), DirectDebitMandate6.mmObject(), DirectDebitTransactionInformation21.mmObject(), DirectDebitTransactionInformation22.mmObject(),
						DirectDebitTransaction9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}