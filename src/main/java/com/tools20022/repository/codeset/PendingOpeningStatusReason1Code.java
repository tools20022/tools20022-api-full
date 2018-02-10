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
import com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a pending account opening status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#Authorisation
 * PendingOpeningStatusReason1Code.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#AuthorisedButPending
 * PendingOpeningStatusReason1Code.AuthorisedButPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#FATCAReportingDateMissing
 * PendingOpeningStatusReason1Code.FATCAReportingDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#KnowYourCustomerDocumentMissing
 * PendingOpeningStatusReason1Code.KnowYourCustomerDocumentMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#NotOpened
 * PendingOpeningStatusReason1Code.NotOpened}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#Restrictions
 * PendingOpeningStatusReason1Code.Restrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code#RightsHolderMissing
 * PendingOpeningStatusReason1Code.RightsHolderMissing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
 * PendingOpeningStatusReasonCode}</li>
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
 * "PendingOpeningStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a pending account opening status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingOpeningStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code Authorisation = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.Authorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedButPending"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code AuthorisedButPending = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedButPending";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.AuthorisedButPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDateMissing"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code FATCAReportingDateMissing = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDateMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.FATCAReportingDateMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerDocumentMissing"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code KnowYourCustomerDocumentMissing = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDocumentMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.KnowYourCustomerDocumentMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotOpened"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code NotOpened = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotOpened";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.NotOpened.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code Restrictions = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restrictions";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.Restrictions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
	 * PendingOpeningStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMissing"</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReason1Code RightsHolderMissing = new PendingOpeningStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.mmObject();
			codeName = PendingOpeningStatusReasonCode.RightsHolderMissing.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingOpeningStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected PendingOpeningStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingOpeningStatusReason1Code";
				definition = "Specifies the reason for a pending account opening status.";
				trace_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.Authorisation, com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.AuthorisedButPending,
						com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.FATCAReportingDateMissing, com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.KnowYourCustomerDocumentMissing,
						com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.NotOpened, com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.Restrictions,
						com.tools20022.repository.codeset.PendingOpeningStatusReason1Code.RightsHolderMissing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Authorisation.getCodeName().get(), Authorisation);
		codesByName.put(AuthorisedButPending.getCodeName().get(), AuthorisedButPending);
		codesByName.put(FATCAReportingDateMissing.getCodeName().get(), FATCAReportingDateMissing);
		codesByName.put(KnowYourCustomerDocumentMissing.getCodeName().get(), KnowYourCustomerDocumentMissing);
		codesByName.put(NotOpened.getCodeName().get(), NotOpened);
		codesByName.put(Restrictions.getCodeName().get(), Restrictions);
		codesByName.put(RightsHolderMissing.getCodeName().get(), RightsHolderMissing);
	}

	public static PendingOpeningStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingOpeningStatusReason1Code[] values() {
		PendingOpeningStatusReason1Code[] values = new PendingOpeningStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingOpeningStatusReason1Code> {
		@Override
		public PendingOpeningStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingOpeningStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}