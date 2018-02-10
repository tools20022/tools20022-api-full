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
import com.tools20022.repository.codeset.SecuritiesBalanceType13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Blocked
 * SecuritiesBalanceType13Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#AvailableWithNoAdditionalStatus
 * SecuritiesBalanceType13Code.AvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Available
 * SecuritiesBalanceType13Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Registered
 * SecuritiesBalanceType13Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Pledged
 * SecuritiesBalanceType13Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#OutForRegistration
 * SecuritiesBalanceType13Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Restricted
 * SecuritiesBalanceType13Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Unclassified
 * SecuritiesBalanceType13Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#StreetPosition
 * SecuritiesBalanceType13Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Unregistered
 * SecuritiesBalanceType13Code.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#Issued
 * SecuritiesBalanceType13Code.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#QuasiIssued
 * SecuritiesBalanceType13Code.QuasiIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code#EligibleForCollateralPurposes
 * SecuritiesBalanceType13Code.EligibleForCollateralPurposes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
 * SecuritiesBalanceTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BLOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceType13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Blocked = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoAdditionalStatus"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code AvailableWithNoAdditionalStatus = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.AvailableWithNoAdditionalStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Available = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Available.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Registered = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Registered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Pledged = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code OutForRegistration = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.OutForRegistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Restricted = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Restricted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Unclassified = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unclassified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code StreetPosition = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.StreetPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Unregistered = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unregistered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code Issued = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Issued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiIssued"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code QuasiIssued = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.QuasiIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType13Code
	 * SecuritiesBalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposes"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType13Code EligibleForCollateralPurposes = new SecuritiesBalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType13Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.EligibleForCollateralPurposes.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType13Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType13Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				trace_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Blocked, com.tools20022.repository.codeset.SecuritiesBalanceType13Code.AvailableWithNoAdditionalStatus,
						com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Available, com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Registered,
						com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceType13Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Restricted, com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceType13Code.StreetPosition, com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Unregistered,
						com.tools20022.repository.codeset.SecuritiesBalanceType13Code.Issued, com.tools20022.repository.codeset.SecuritiesBalanceType13Code.QuasiIssued,
						com.tools20022.repository.codeset.SecuritiesBalanceType13Code.EligibleForCollateralPurposes);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(AvailableWithNoAdditionalStatus.getCodeName().get(), AvailableWithNoAdditionalStatus);
		codesByName.put(Available.getCodeName().get(), Available);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Unregistered.getCodeName().get(), Unregistered);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(QuasiIssued.getCodeName().get(), QuasiIssued);
		codesByName.put(EligibleForCollateralPurposes.getCodeName().get(), EligibleForCollateralPurposes);
	}

	public static SecuritiesBalanceType13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType13Code[] values() {
		SecuritiesBalanceType13Code[] values = new SecuritiesBalanceType13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType13Code> {
		@Override
		public SecuritiesBalanceType13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}