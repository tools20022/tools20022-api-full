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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
 * DirectDebitMandate.mmRelatedDirectDebit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmDirectDebit
 * PaymentInstrument7.mmDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#mmDirectDebitDetails
 * PaymentInstrument8.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmDirectDebitDetails
 * PaymentInstrument17Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmDirectDebitTransaction
 * DirectDebitTransactionInformation1.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#mmDirectDebitTransactionInformation
 * PaymentInstructionInformation2.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmDirectDebitTransaction
 * DirectDebitTransactionInformation9.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#mmDirectDebitTransactionInformation
 * PaymentInstructionInformation4.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmDirectDebitTransaction
 * DirectDebitTransactionInformation11.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmDirectDebitTransactionInformation
 * PaymentInstruction7.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmDirectDebitTransaction
 * DirectDebitTransactionInformation13.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmDirectDebitTransactionInformation
 * PaymentInstruction10.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmDirectDebitTransaction
 * DirectDebitTransactionInformation2.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmDirectDebitTransaction
 * DirectDebitTransactionInformation10.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmDirectDebitTransaction
 * DirectDebitTransactionInformation12.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmDirectDebitTransaction
 * DirectDebitTransactionInformation14.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#mmDirectDebitDetails
 * PaymentInstrument9Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#mmDirectDebitDetails
 * PaymentInstrument10Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#mmDirectDebitDetails
 * PaymentInstrument6Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#mmDirectDebitDetails
 * PaymentInstrument8Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmDirectDebitDetails
 * PaymentInstrument12Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmDirectDebitTransactionInformation
 * CreditTransferTransaction9.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmDirectDebitTransaction
 * DirectDebitTransactionInformation5.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmDirectDebitTransaction
 * DirectDebitTransactionInformation7.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmDirectDebitTransaction
 * DirectDebitTransactionInformation6.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmDirectDebitTransaction
 * DirectDebitTransactionInformation8.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmDirectDebitTransaction
 * DirectDebitTransactionInformation17.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmDirectDebitTransactionInformation
 * PaymentInstruction15.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmDirectDebitTransaction
 * DirectDebitTransactionInformation18.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmDirectDebitTransactionInformation
 * PaymentInstruction18.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmDirectDebitTransaction
 * DirectDebitTransactionInformation20.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmDirectDebitTransaction
 * DirectDebitTransactionInformation19.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#mmDirectDebitDetails
 * PaymentInstrument18Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmDirectDebitDetails
 * PaymentInstrument20Choice.mmDirectDebitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmDirectDebitTransactionInformation
 * PaymentInstruction21.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmDirectDebitTransaction
 * DirectDebitTransactionInformation21.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmDirectDebitTransaction
 * DirectDebitTransactionInformation22.mmDirectDebitTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmRegistrationIdentification
 * DirectDebit.mmRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
 * DirectDebit.mmDirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationIdentification
 * DirectDebit.mmPreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationDate
 * DirectDebit.mmPreNotificationDate}</li>
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
 * "DirectDebit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
 * </li>
 * </ul>
 */
public class DirectDebit extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text registrationIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate2#mmRegistrationIdentification
	 * DirectDebitMandate2.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmRegistrationIdentification
	 * DirectDebitMandate3.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmRegistrationIdentification
	 * DirectDebitMandate4.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmRegistrationIdentification
	 * DirectDebitMandate5.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmRegistrationIdentification
	 * DirectDebitMandate6.mmRegistrationIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRegistrationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitMandate2.mmRegistrationIdentification, DirectDebitMandate3.mmRegistrationIdentification, DirectDebitMandate4.mmRegistrationIdentification,
					DirectDebitMandate5.mmRegistrationIdentification, DirectDebitMandate6.mmRegistrationIdentification);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DirectDebitMandate directDebitMandate;
	/**
	 * Set of elements providing information specific to the direct debit
	 * mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
	 * DirectDebitMandate.mmRelatedDirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction1#mmMandateRelatedInformation
	 * DirectDebitTransaction1.mmMandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6#mmMandateRelatedInformation
	 * DirectDebitTransaction6.mmMandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmMandateRelatedInformation
	 * DirectDebitTransaction7.mmMandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction4#mmMandateRelatedInformation
	 * DirectDebitTransaction4.mmMandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction5#mmMandateRelatedInformation
	 * DirectDebitTransaction5.mmMandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmMandateRelatedInformation
	 * DirectDebitTransaction8.mmMandateRelatedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDirectDebitMandateIdentification
	 * PaymentTerms6.mmDirectDebitMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmMandateRelatedInformation
	 * DirectDebitTransaction9.mmMandateRelatedInformation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmDirectDebitMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransaction1.mmMandateRelatedInformation, DirectDebitTransaction6.mmMandateRelatedInformation, DirectDebitTransaction7.mmMandateRelatedInformation,
					DirectDebitTransaction4.mmMandateRelatedInformation, DirectDebitTransaction5.mmMandateRelatedInformation, DirectDebitTransaction8.mmMandateRelatedInformation, PaymentTerms6.mmDirectDebitMandateIdentification,
					DirectDebitTransaction9.mmMandateRelatedInformation);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectDebitMandate";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
		}
	};
	protected Max35Text preNotificationIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction1#mmPreNotificationIdentification
	 * DirectDebitTransaction1.mmPreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6#mmPreNotificationIdentification
	 * DirectDebitTransaction6.mmPreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmPreNotificationIdentification
	 * DirectDebitTransaction7.mmPreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction5#mmPreNotificationIdentification
	 * DirectDebitTransaction5.mmPreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmPreNotificationIdentification
	 * DirectDebitTransaction8.mmPreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmPreNotificationIdentification
	 * DirectDebitTransaction9.mmPreNotificationIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPreNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransaction1.mmPreNotificationIdentification, DirectDebitTransaction6.mmPreNotificationIdentification, DirectDebitTransaction7.mmPreNotificationIdentification,
					DirectDebitTransaction5.mmPreNotificationIdentification, DirectDebitTransaction8.mmPreNotificationIdentification, DirectDebitTransaction9.mmPreNotificationIdentification);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate preNotificationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction1#mmPreNotificationDate
	 * DirectDebitTransaction1.mmPreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6#mmPreNotificationDate
	 * DirectDebitTransaction6.mmPreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmPreNotificationDate
	 * DirectDebitTransaction7.mmPreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction5#mmPreNotificationDate
	 * DirectDebitTransaction5.mmPreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmPreNotificationDate
	 * DirectDebitTransaction8.mmPreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmPreNotificationDate
	 * DirectDebitTransaction9.mmPreNotificationDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPreNotificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransaction1.mmPreNotificationDate, DirectDebitTransaction6.mmPreNotificationDate, DirectDebitTransaction7.mmPreNotificationDate, DirectDebitTransaction5.mmPreNotificationDate,
					DirectDebitTransaction8.mmPreNotificationDate, DirectDebitTransaction9.mmPreNotificationDate);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebit";
				definition = "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit);
				derivationElement_lazy = () -> Arrays.asList(PaymentInstrument7.mmDirectDebit, PaymentInstrument8.mmDirectDebitDetails, PaymentInstrument17Choice.mmDirectDebitDetails,
						DirectDebitTransactionInformation1.mmDirectDebitTransaction, PaymentInstructionInformation2.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation9.mmDirectDebitTransaction,
						PaymentInstructionInformation4.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation11.mmDirectDebitTransaction, PaymentInstruction7.mmDirectDebitTransactionInformation,
						DirectDebitTransactionInformation13.mmDirectDebitTransaction, PaymentInstruction10.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation2.mmDirectDebitTransaction,
						DirectDebitTransactionInformation10.mmDirectDebitTransaction, DirectDebitTransactionInformation12.mmDirectDebitTransaction, DirectDebitTransactionInformation14.mmDirectDebitTransaction,
						PaymentInstrument9Choice.mmDirectDebitDetails, PaymentInstrument10Choice.mmDirectDebitDetails, PaymentInstrument6Choice.mmDirectDebitDetails, PaymentInstrument8Choice.mmDirectDebitDetails,
						PaymentInstrument12Choice.mmDirectDebitDetails, CreditTransferTransaction9.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation5.mmDirectDebitTransaction,
						DirectDebitTransactionInformation7.mmDirectDebitTransaction, DirectDebitTransactionInformation6.mmDirectDebitTransaction, DirectDebitTransactionInformation8.mmDirectDebitTransaction,
						DirectDebitTransactionInformation17.mmDirectDebitTransaction, PaymentInstruction15.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation18.mmDirectDebitTransaction,
						PaymentInstruction18.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation20.mmDirectDebitTransaction, DirectDebitTransactionInformation19.mmDirectDebitTransaction,
						PaymentInstrument18Choice.mmDirectDebitDetails, PaymentInstrument20Choice.mmDirectDebitDetails, PaymentInstruction21.mmDirectDebitTransactionInformation, DirectDebitTransactionInformation21.mmDirectDebitTransaction,
						DirectDebitTransactionInformation22.mmDirectDebitTransaction);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(DirectDebit.mmRegistrationIdentification, DirectDebit.mmDirectDebitMandate, DirectDebit.mmPreNotificationIdentification, DirectDebit.mmPreNotificationDate);
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

	public Max35Text getRegistrationIdentification() {
		return registrationIdentification;
	}

	public void setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = registrationIdentification;
	}

	public DirectDebitMandate getDirectDebitMandate() {
		return directDebitMandate;
	}

	public void setDirectDebitMandate(com.tools20022.repository.entity.DirectDebitMandate directDebitMandate) {
		this.directDebitMandate = directDebitMandate;
	}

	public Max35Text getPreNotificationIdentification() {
		return preNotificationIdentification;
	}

	public void setPreNotificationIdentification(Max35Text preNotificationIdentification) {
		this.preNotificationIdentification = preNotificationIdentification;
	}

	public ISODate getPreNotificationDate() {
		return preNotificationDate;
	}

	public void setPreNotificationDate(ISODate preNotificationDate) {
		this.preNotificationDate = preNotificationDate;
	}
}