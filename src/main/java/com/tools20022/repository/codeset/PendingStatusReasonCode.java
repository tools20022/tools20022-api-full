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
import com.tools20022.repository.codeset.PendingStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#KnowYourCustomerDocumentMissing
 * PendingStatusReasonCode.KnowYourCustomerDocumentMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#FATCAReportingDateMissing
 * PendingStatusReasonCode.FATCAReportingDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#RightsHolderMissing
 * PendingStatusReasonCode.RightsHolderMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#ModificationInProcess
 * PendingStatusReasonCode.ModificationInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#Authorisation
 * PendingStatusReasonCode.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#AuthorisedButPending
 * PendingStatusReasonCode.AuthorisedButPending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
 * PendingStatusReason1Code}</li>
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
 * "PendingStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a pending status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Know Your Customer (KYC) document is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerDocumentMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Know Your Customer (KYC) document is missing."</li>
	 * </ul>
	 */
	public static final PendingStatusReasonCode KnowYourCustomerDocumentMissing = new PendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDocumentMissing";
			definition = "Know Your Customer (KYC) document is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReasonCode.mmObject();
			codeName = "KYCM";
		}
	};
	/**
	 * FATCA reporting date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDateMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FATCA reporting date is missing."</li>
	 * </ul>
	 */
	public static final PendingStatusReasonCode FATCAReportingDateMissing = new PendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDateMissing";
			definition = "FATCA reporting date is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReasonCode.mmObject();
			codeName = "FRDM";
		}
	};
	/**
	 * Rights holder information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIGH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights holder information is missing."</li>
	 * </ul>
	 */
	public static final PendingStatusReasonCode RightsHolderMissing = new PendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMissing";
			definition = "Rights holder information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReasonCode.mmObject();
			codeName = "RIGH";
		}
	};
	/**
	 * Modification to the account data is in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification to the account data is in process."</li>
	 * </ul>
	 */
	public static final PendingStatusReasonCode ModificationInProcess = new PendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationInProcess";
			definition = "Modification to the account data is in process.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReasonCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Authorisation is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation is required."</li>
	 * </ul>
	 */
	public static final PendingStatusReasonCode Authorisation = new PendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Authorisation is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReasonCode.mmObject();
			codeName = "ATHR";
		}
	};
	/**
	 * Authorisation is provided but the account change is still pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedButPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authorisation is provided but the account change is still pending."</li>
	 * </ul>
	 */
	public static final PendingStatusReasonCode AuthorisedButPending = new PendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedButPending";
			definition = "Authorisation is provided but the account change is still pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReasonCode.mmObject();
			codeName = "ATHP";
		}
	};
	final static private LinkedHashMap<String, PendingStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected PendingStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingStatusReasonCode";
				definition = "Specifies the reason for a pending status.";
				derivation_lazy = () -> Arrays.asList(PendingStatusReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingStatusReasonCode.KnowYourCustomerDocumentMissing, com.tools20022.repository.codeset.PendingStatusReasonCode.FATCAReportingDateMissing,
						com.tools20022.repository.codeset.PendingStatusReasonCode.RightsHolderMissing, com.tools20022.repository.codeset.PendingStatusReasonCode.ModificationInProcess,
						com.tools20022.repository.codeset.PendingStatusReasonCode.Authorisation, com.tools20022.repository.codeset.PendingStatusReasonCode.AuthorisedButPending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(KnowYourCustomerDocumentMissing.getCodeName().get(), KnowYourCustomerDocumentMissing);
		codesByName.put(FATCAReportingDateMissing.getCodeName().get(), FATCAReportingDateMissing);
		codesByName.put(RightsHolderMissing.getCodeName().get(), RightsHolderMissing);
		codesByName.put(ModificationInProcess.getCodeName().get(), ModificationInProcess);
		codesByName.put(Authorisation.getCodeName().get(), Authorisation);
		codesByName.put(AuthorisedButPending.getCodeName().get(), AuthorisedButPending);
	}

	public static PendingStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingStatusReasonCode[] values() {
		PendingStatusReasonCode[] values = new PendingStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingStatusReasonCode> {
		@Override
		public PendingStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}