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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DocumentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#MeteredServiceInvoice
 * DocumentType1Code.MeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#CreditNoteRelatedToFinancialAdjustment
 * DocumentType1Code.CreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#DebitNoteRelatedToFinancialAdjustment
 * DocumentType1Code.DebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#CommercialInvoice
 * DocumentType1Code.CommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#CreditNote
 * DocumentType1Code.CreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#DebitNote
 * DocumentType1Code.DebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#HireInvoice
 * DocumentType1Code.HireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#SelfBilledInvoice
 * DocumentType1Code.SelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#RemittanceAdviceMessage
 * DocumentType1Code.RemittanceAdviceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#RelatedPaymentInstruction
 * DocumentType1Code.RelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#CommercialContract
 * DocumentType1Code.CommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#ForeignExchangeDealReference
 * DocumentType1Code.ForeignExchangeDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code#StatementOfAccount
 * DocumentType1Code.StatementOfAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
 * DocumentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MSIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DocumentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType1Code MeteredServiceInvoice = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeteredServiceInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.MeteredServiceInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final DocumentType1Code CreditNoteRelatedToFinancialAdjustment = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.CreditNoteRelatedToFinancialAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final DocumentType1Code DebitNoteRelatedToFinancialAdjustment = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.DebitNoteRelatedToFinancialAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType1Code CommercialInvoice = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.CommercialInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * </ul>
	 */
	public static final DocumentType1Code CreditNote = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.CreditNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * </ul>
	 */
	public static final DocumentType1Code DebitNote = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.DebitNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType1Code HireInvoice = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HireInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.HireInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType1Code SelfBilledInvoice = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfBilledInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.SelfBilledInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceAdviceMessage"</li>
	 * </ul>
	 */
	public static final DocumentType1Code RemittanceAdviceMessage = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceAdviceMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.RemittanceAdviceMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * </ul>
	 */
	public static final DocumentType1Code RelatedPaymentInstruction = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.RelatedPaymentInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * </ul>
	 */
	public static final DocumentType1Code CommercialContract = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialContract";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.CommercialContract.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDealReference"</li>
	 * </ul>
	 */
	public static final DocumentType1Code ForeignExchangeDealReference = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDealReference";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.ForeignExchangeDealReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * </ul>
	 */
	public static final DocumentType1Code StatementOfAccount = new DocumentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementOfAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType1Code.mmObject();
			codeName = DocumentTypeCode.StatementOfAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DocumentType1Code> codesByName = new LinkedHashMap<>();

	protected DocumentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentType1Code";
				definition = "Specifies a type of financial or commercial document.";
				trace_lazy = () -> DocumentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentType1Code.MeteredServiceInvoice, com.tools20022.repository.codeset.DocumentType1Code.CreditNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentType1Code.DebitNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentType1Code.CommercialInvoice,
						com.tools20022.repository.codeset.DocumentType1Code.CreditNote, com.tools20022.repository.codeset.DocumentType1Code.DebitNote, com.tools20022.repository.codeset.DocumentType1Code.HireInvoice,
						com.tools20022.repository.codeset.DocumentType1Code.SelfBilledInvoice, com.tools20022.repository.codeset.DocumentType1Code.RemittanceAdviceMessage,
						com.tools20022.repository.codeset.DocumentType1Code.RelatedPaymentInstruction, com.tools20022.repository.codeset.DocumentType1Code.CommercialContract,
						com.tools20022.repository.codeset.DocumentType1Code.ForeignExchangeDealReference, com.tools20022.repository.codeset.DocumentType1Code.StatementOfAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MeteredServiceInvoice.getCodeName().get(), MeteredServiceInvoice);
		codesByName.put(CreditNoteRelatedToFinancialAdjustment.getCodeName().get(), CreditNoteRelatedToFinancialAdjustment);
		codesByName.put(DebitNoteRelatedToFinancialAdjustment.getCodeName().get(), DebitNoteRelatedToFinancialAdjustment);
		codesByName.put(CommercialInvoice.getCodeName().get(), CommercialInvoice);
		codesByName.put(CreditNote.getCodeName().get(), CreditNote);
		codesByName.put(DebitNote.getCodeName().get(), DebitNote);
		codesByName.put(HireInvoice.getCodeName().get(), HireInvoice);
		codesByName.put(SelfBilledInvoice.getCodeName().get(), SelfBilledInvoice);
		codesByName.put(RemittanceAdviceMessage.getCodeName().get(), RemittanceAdviceMessage);
		codesByName.put(RelatedPaymentInstruction.getCodeName().get(), RelatedPaymentInstruction);
		codesByName.put(CommercialContract.getCodeName().get(), CommercialContract);
		codesByName.put(ForeignExchangeDealReference.getCodeName().get(), ForeignExchangeDealReference);
		codesByName.put(StatementOfAccount.getCodeName().get(), StatementOfAccount);
	}

	public static DocumentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DocumentType1Code[] values() {
		DocumentType1Code[] values = new DocumentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DocumentType1Code> {
		@Override
		public DocumentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DocumentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}