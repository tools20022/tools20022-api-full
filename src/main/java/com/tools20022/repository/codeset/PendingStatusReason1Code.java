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
import com.tools20022.repository.codeset.PendingStatusReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code#KnowYourCustomerDocumentMissing
 * PendingStatusReason1Code.KnowYourCustomerDocumentMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code#FATCAReportingDateMissing
 * PendingStatusReason1Code.FATCAReportingDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code#RightsHolderMissing
 * PendingStatusReason1Code.RightsHolderMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code#Authorisation
 * PendingStatusReason1Code.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code#AuthorisedButPending
 * PendingStatusReason1Code.AuthorisedButPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code#ModificationInProcess
 * PendingStatusReason1Code.ModificationInProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
 * PendingStatusReasonCode}</li>
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
 * "PendingStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a pending status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerDocumentMissing"</li>
	 * </ul>
	 */
	public static final PendingStatusReason1Code KnowYourCustomerDocumentMissing = new PendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDocumentMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReason1Code.mmObject();
			codeName = PendingStatusReasonCode.KnowYourCustomerDocumentMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDateMissing"</li>
	 * </ul>
	 */
	public static final PendingStatusReason1Code FATCAReportingDateMissing = new PendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDateMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReason1Code.mmObject();
			codeName = PendingStatusReasonCode.FATCAReportingDateMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMissing"</li>
	 * </ul>
	 */
	public static final PendingStatusReason1Code RightsHolderMissing = new PendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReason1Code.mmObject();
			codeName = PendingStatusReasonCode.RightsHolderMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * </ul>
	 */
	public static final PendingStatusReason1Code Authorisation = new PendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReason1Code.mmObject();
			codeName = PendingStatusReasonCode.Authorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedButPending"</li>
	 * </ul>
	 */
	public static final PendingStatusReason1Code AuthorisedButPending = new PendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedButPending";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReason1Code.mmObject();
			codeName = PendingStatusReasonCode.AuthorisedButPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
	 * PendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationInProcess"</li>
	 * </ul>
	 */
	public static final PendingStatusReason1Code ModificationInProcess = new PendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatusReason1Code.mmObject();
			codeName = PendingStatusReasonCode.ModificationInProcess.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected PendingStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingStatusReason1Code";
				definition = "Specifies the reason for a pending status.";
				trace_lazy = () -> PendingStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingStatusReason1Code.KnowYourCustomerDocumentMissing, com.tools20022.repository.codeset.PendingStatusReason1Code.FATCAReportingDateMissing,
						com.tools20022.repository.codeset.PendingStatusReason1Code.RightsHolderMissing, com.tools20022.repository.codeset.PendingStatusReason1Code.Authorisation,
						com.tools20022.repository.codeset.PendingStatusReason1Code.AuthorisedButPending, com.tools20022.repository.codeset.PendingStatusReason1Code.ModificationInProcess);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(KnowYourCustomerDocumentMissing.getCodeName().get(), KnowYourCustomerDocumentMissing);
		codesByName.put(FATCAReportingDateMissing.getCodeName().get(), FATCAReportingDateMissing);
		codesByName.put(RightsHolderMissing.getCodeName().get(), RightsHolderMissing);
		codesByName.put(Authorisation.getCodeName().get(), Authorisation);
		codesByName.put(AuthorisedButPending.getCodeName().get(), AuthorisedButPending);
		codesByName.put(ModificationInProcess.getCodeName().get(), ModificationInProcess);
	}

	public static PendingStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingStatusReason1Code[] values() {
		PendingStatusReason1Code[] values = new PendingStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingStatusReason1Code> {
		@Override
		public PendingStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}