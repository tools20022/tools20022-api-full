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
import com.tools20022.repository.codeset.DocumentType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#MeteredServiceInvoice
 * DocumentType2Code.MeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#CreditNoteRelatedToFinancialAdjustment
 * DocumentType2Code.CreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#DebitNoteRelatedToFinancialAdjustment
 * DocumentType2Code.DebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#CommercialInvoice
 * DocumentType2Code.CommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#CreditNote
 * DocumentType2Code.CreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#DebitNote
 * DocumentType2Code.DebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#HireInvoice
 * DocumentType2Code.HireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#SelfBilledInvoice
 * DocumentType2Code.SelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#CommercialContract
 * DocumentType2Code.CommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#StatementOfAccount
 * DocumentType2Code.StatementOfAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code#DispatchAdvice
 * DocumentType2Code.DispatchAdvice}</li>
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
 * "DocumentType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DocumentType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType2Code MeteredServiceInvoice = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeteredServiceInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.MeteredServiceInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final DocumentType2Code CreditNoteRelatedToFinancialAdjustment = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.CreditNoteRelatedToFinancialAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final DocumentType2Code DebitNoteRelatedToFinancialAdjustment = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.DebitNoteRelatedToFinancialAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType2Code CommercialInvoice = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.CommercialInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * </ul>
	 */
	public static final DocumentType2Code CreditNote = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.CreditNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * </ul>
	 */
	public static final DocumentType2Code DebitNote = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNote";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.DebitNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType2Code HireInvoice = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HireInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.HireInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * </ul>
	 */
	public static final DocumentType2Code SelfBilledInvoice = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfBilledInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.SelfBilledInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * </ul>
	 */
	public static final DocumentType2Code CommercialContract = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialContract";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.CommercialContract.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * </ul>
	 */
	public static final DocumentType2Code StatementOfAccount = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementOfAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.StatementOfAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType2Code
	 * DocumentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * </ul>
	 */
	public static final DocumentType2Code DispatchAdvice = new DocumentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.DocumentType2Code.mmObject();
			codeName = DocumentTypeCode.DispatchAdvice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DocumentType2Code> codesByName = new LinkedHashMap<>();

	protected DocumentType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentType2Code";
				definition = "Specifies a type of financial or commercial document.";
				trace_lazy = () -> DocumentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentType2Code.MeteredServiceInvoice, com.tools20022.repository.codeset.DocumentType2Code.CreditNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentType2Code.DebitNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentType2Code.CommercialInvoice,
						com.tools20022.repository.codeset.DocumentType2Code.CreditNote, com.tools20022.repository.codeset.DocumentType2Code.DebitNote, com.tools20022.repository.codeset.DocumentType2Code.HireInvoice,
						com.tools20022.repository.codeset.DocumentType2Code.SelfBilledInvoice, com.tools20022.repository.codeset.DocumentType2Code.CommercialContract, com.tools20022.repository.codeset.DocumentType2Code.StatementOfAccount,
						com.tools20022.repository.codeset.DocumentType2Code.DispatchAdvice);
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
		codesByName.put(CommercialContract.getCodeName().get(), CommercialContract);
		codesByName.put(StatementOfAccount.getCodeName().get(), StatementOfAccount);
		codesByName.put(DispatchAdvice.getCodeName().get(), DispatchAdvice);
	}

	public static DocumentType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DocumentType2Code[] values() {
		DocumentType2Code[] values = new DocumentType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DocumentType2Code> {
		@Override
		public DocumentType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DocumentType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}