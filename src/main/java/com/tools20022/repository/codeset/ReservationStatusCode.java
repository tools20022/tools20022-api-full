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
import com.tools20022.repository.codeset.ReservationStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#Enabled
 * ReservationStatusCode.Enabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#Disabled
 * ReservationStatusCode.Disabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#Deleted
 * ReservationStatusCode.Deleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#Requested
 * ReservationStatusCode.Requested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#Blocked
 * ReservationStatusCode.Blocked}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReservationStatus1Code
 * ReservationStatus1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ENAB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the current status of a limit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReservationStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reservation is currently in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation is currently in effect."</li>
	 * </ul>
	 */
	public static final ReservationStatusCode Enabled = new ReservationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Reservation is currently in effect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Reservation is not currently in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation is not currently in effect.\n"</li>
	 * </ul>
	 */
	public static final ReservationStatusCode Disabled = new ReservationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Reservation is not currently in effect.\n";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Reservation has been deleted or suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation has been deleted or suspended."</li>
	 * </ul>
	 */
	public static final ReservationStatusCode Deleted = new ReservationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Reservation has been deleted or suspended.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationStatusCode.mmObject();
			codeName = "DELD";
		}
	};
	/**
	 * Reservation has been asked for and is not yet enabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Requested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation has been asked for and is not yet enabled.\n"</li>
	 * </ul>
	 */
	public static final ReservationStatusCode Requested = new ReservationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			definition = "Reservation has been asked for and is not yet enabled.\n";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationStatusCode.mmObject();
			codeName = "REQD";
		}
	};
	/**
	 * Reservation is blocked or frozen due to external circumstances such as a
	 * court order, death of beneficiary or account owner, or bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLKD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reservation is blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final ReservationStatusCode Blocked = new ReservationStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Reservation is blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationStatusCode.mmObject();
			codeName = "BLKD";
		}
	};
	final static private LinkedHashMap<String, ReservationStatusCode> codesByName = new LinkedHashMap<>();

	protected ReservationStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ENAB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReservationStatusCode";
				definition = "Specifies the current status of a limit.";
				derivation_lazy = () -> Arrays.asList(ReservationStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReservationStatusCode.Enabled, com.tools20022.repository.codeset.ReservationStatusCode.Disabled,
						com.tools20022.repository.codeset.ReservationStatusCode.Deleted, com.tools20022.repository.codeset.ReservationStatusCode.Requested, com.tools20022.repository.codeset.ReservationStatusCode.Blocked);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Enabled.getCodeName().get(), Enabled);
		codesByName.put(Disabled.getCodeName().get(), Disabled);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
		codesByName.put(Requested.getCodeName().get(), Requested);
		codesByName.put(Blocked.getCodeName().get(), Blocked);
	}

	public static ReservationStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReservationStatusCode[] values() {
		ReservationStatusCode[] values = new ReservationStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReservationStatusCode> {
		@Override
		public ReservationStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReservationStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}