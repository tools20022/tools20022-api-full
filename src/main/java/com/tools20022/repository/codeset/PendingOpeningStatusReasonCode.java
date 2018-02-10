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
import com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#KnowYourCustomerDocumentMissing
 * PendingOpeningStatusReasonCode.KnowYourCustomerDocumentMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#FATCAReportingDateMissing
 * PendingOpeningStatusReasonCode.FATCAReportingDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#RightsHolderMissing
 * PendingOpeningStatusReasonCode.RightsHolderMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#Authorisation
 * PendingOpeningStatusReasonCode.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#AuthorisedButPending
 * PendingOpeningStatusReasonCode.AuthorisedButPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#NotOpened
 * PendingOpeningStatusReasonCode.NotOpened}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#Restrictions
 * PendingOpeningStatusReasonCode.Restrictions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
 * PendingOpeningStatusReason1Code}</li>
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
 * "PendingOpeningStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a pending account opening status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingOpeningStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Know Your Customer (KYC) document is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
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
	public static final PendingOpeningStatusReasonCode KnowYourCustomerDocumentMissing = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDocumentMissing";
			definition = "Know Your Customer (KYC) document is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "KYCM";
		}
	};
	/**
	 * FATCA reporting date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
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
	public static final PendingOpeningStatusReasonCode FATCAReportingDateMissing = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDateMissing";
			definition = "FATCA reporting date is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "FRDM";
		}
	};
	/**
	 * Rights holder information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
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
	public static final PendingOpeningStatusReasonCode RightsHolderMissing = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMissing";
			definition = "Rights holder information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "RIGH";
		}
	};
	/**
	 * Authorisation is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
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
	public static final PendingOpeningStatusReasonCode Authorisation = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Authorisation is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "ATHR";
		}
	};
	/**
	 * Authorisation is provided but account opening is still pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
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
	 * "Authorisation is provided but account opening is still pending."</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReasonCode AuthorisedButPending = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedButPending";
			definition = "Authorisation is provided but account opening is still pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "ATHP";
		}
	};
	/**
	 * Account is not yet open, even for partial use.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotOpened"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is not yet open, even for partial use."</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReasonCode NotOpened = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotOpened";
			definition = "Account is not yet open, even for partial use.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "NOTO";
		}
	};
	/**
	 * Account will be opened when restrictions are addressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account will be opened when restrictions are addressed."</li>
	 * </ul>
	 */
	public static final PendingOpeningStatusReasonCode Restrictions = new PendingOpeningStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restrictions";
			definition = "Account will be opened when restrictions are addressed.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.mmObject();
			codeName = "REST";
		}
	};
	final static private LinkedHashMap<String, PendingOpeningStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected PendingOpeningStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingOpeningStatusReasonCode";
				definition = "Specifies the reason for a pending account opening status.";
				derivation_lazy = () -> Arrays.asList(PendingOpeningStatusReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.KnowYourCustomerDocumentMissing, com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.FATCAReportingDateMissing,
						com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.RightsHolderMissing, com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.Authorisation,
						com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.AuthorisedButPending, com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.NotOpened,
						com.tools20022.repository.codeset.PendingOpeningStatusReasonCode.Restrictions);
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
		codesByName.put(NotOpened.getCodeName().get(), NotOpened);
		codesByName.put(Restrictions.getCodeName().get(), Restrictions);
	}

	public static PendingOpeningStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingOpeningStatusReasonCode[] values() {
		PendingOpeningStatusReasonCode[] values = new PendingOpeningStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingOpeningStatusReasonCode> {
		@Override
		public PendingOpeningStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingOpeningStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}