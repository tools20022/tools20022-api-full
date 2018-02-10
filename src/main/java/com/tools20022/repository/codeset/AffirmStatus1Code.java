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
import com.tools20022.repository.codeset.AffirmStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the status of the confirmation acknowledgement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#AckToConfirmCompleteNotification
 * AffirmStatus1Code.AckToConfirmCompleteNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#AckToSettlementStateChanged
 * AffirmStatus1Code.AckToSettlementStateChanged}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#Compared
 * AffirmStatus1Code.Compared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#MisMatched
 * AffirmStatus1Code.MisMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#ModeError
 * AffirmStatus1Code.ModeError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#NoTradingPrivilege
 * AffirmStatus1Code.NoTradingPrivilege}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#OutOfRange
 * AffirmStatus1Code.OutOfRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#OutOfService
 * AffirmStatus1Code.OutOfService}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#Received
 * AffirmStatus1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code#Unreceived
 * AffirmStatus1Code.Unreceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
 * AffirmStatusCode}</li>
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
 * "AffirmStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the confirmation acknowledgement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AffirmStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AckToConfirmCompleteNotification"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code AckToConfirmCompleteNotification = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AckToConfirmCompleteNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.AckToConfirmCompleteNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AckToSettlementStateChanged"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code AckToSettlementStateChanged = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AckToSettlementStateChanged";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.AckToSettlementStateChanged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compared"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code Compared = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compared";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.Compared.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MisMatched"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code MisMatched = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MisMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.MisMatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModeError"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code ModeError = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModeError";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.ModeError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTradingPrivilege"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code NoTradingPrivilege = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTradingPrivilege";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.NoTradingPrivilege.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfRange"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code OutOfRange = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfRange";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.OutOfRange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfService"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code OutOfService = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfService";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.OutOfService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code Received = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unreceived"</li>
	 * </ul>
	 */
	public static final AffirmStatus1Code Unreceived = new AffirmStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unreceived";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatus1Code.mmObject();
			codeName = AffirmStatusCode.Unreceived.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AffirmStatus1Code> codesByName = new LinkedHashMap<>();

	protected AffirmStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AffirmStatus1Code";
				definition = "Identifies the status of the confirmation acknowledgement.";
				trace_lazy = () -> AffirmStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AffirmStatus1Code.AckToConfirmCompleteNotification, com.tools20022.repository.codeset.AffirmStatus1Code.AckToSettlementStateChanged,
						com.tools20022.repository.codeset.AffirmStatus1Code.Compared, com.tools20022.repository.codeset.AffirmStatus1Code.MisMatched, com.tools20022.repository.codeset.AffirmStatus1Code.ModeError,
						com.tools20022.repository.codeset.AffirmStatus1Code.NoTradingPrivilege, com.tools20022.repository.codeset.AffirmStatus1Code.OutOfRange, com.tools20022.repository.codeset.AffirmStatus1Code.OutOfService,
						com.tools20022.repository.codeset.AffirmStatus1Code.Received, com.tools20022.repository.codeset.AffirmStatus1Code.Unreceived);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AckToConfirmCompleteNotification.getCodeName().get(), AckToConfirmCompleteNotification);
		codesByName.put(AckToSettlementStateChanged.getCodeName().get(), AckToSettlementStateChanged);
		codesByName.put(Compared.getCodeName().get(), Compared);
		codesByName.put(MisMatched.getCodeName().get(), MisMatched);
		codesByName.put(ModeError.getCodeName().get(), ModeError);
		codesByName.put(NoTradingPrivilege.getCodeName().get(), NoTradingPrivilege);
		codesByName.put(OutOfRange.getCodeName().get(), OutOfRange);
		codesByName.put(OutOfService.getCodeName().get(), OutOfService);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Unreceived.getCodeName().get(), Unreceived);
	}

	public static AffirmStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AffirmStatus1Code[] values() {
		AffirmStatus1Code[] values = new AffirmStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AffirmStatus1Code> {
		@Override
		public AffirmStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AffirmStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}