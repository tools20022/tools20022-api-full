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
import com.tools20022.repository.codeset.AffirmStatusCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.AffirmStatusCode#Compared
 * AffirmStatusCode.Compared}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AffirmStatusCode#Received
 * AffirmStatusCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#MisMatched
 * AffirmStatusCode.MisMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#OutOfService
 * AffirmStatusCode.OutOfService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#OutOfRange
 * AffirmStatusCode.OutOfRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#AckToConfirmCompleteNotification
 * AffirmStatusCode.AckToConfirmCompleteNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#Unreceived
 * AffirmStatusCode.Unreceived}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AffirmStatusCode#ModeError
 * AffirmStatusCode.ModeError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#AckToSettlementStateChanged
 * AffirmStatusCode.AckToSettlementStateChanged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode#NoTradingPrivilege
 * AffirmStatusCode.NoTradingPrivilege}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
 * AffirmStatus1Code}</li>
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
 * "AffirmStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the confirmation acknowledgement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AffirmStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data was successfully matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data was successfully matched."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode Compared = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compared";
			definition = "Data was successfully matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Format of upload data was right, and system receives successfully.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of upload data was right, and system receives successfully."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode Received = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Format of upload data was right, and system receives successfully.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Data was mismatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MisMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data was mismatched."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode MisMatched = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MisMatched";
			definition = "Data was mismatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "MISM";
		}
	};
	/**
	 * Query time was over system service time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query time was over system service time."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode OutOfService = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfService";
			definition = "Query time was over system service time.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "OUOS";
		}
	};
	/**
	 * Query time was out of range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query time was out of range."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode OutOfRange = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfRange";
			definition = "Query time was out of range.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "OUOR";
		}
	};
	/**
	 * Notfies that the trade confimation was conpleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AckToConfirmCompleteNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notfies that the trade confimation was conpleted."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode AckToConfirmCompleteNotification = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AckToConfirmCompleteNotification";
			definition = "Notfies that the trade confimation was conpleted.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "ATCN";
		}
	};
	/**
	 * Format of upload data was wrong, and system receives unsuccessfully.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unreceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of upload data was wrong, and system receives unsuccessfully."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode Unreceived = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unreceived";
			definition = "Format of upload data was wrong, and system receives unsuccessfully.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "UNRE";
		}
	};
	/**
	 * Model has errors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModeError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Model has errors."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode ModeError = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModeError";
			definition = "Model has errors.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "MISE";
		}
	};
	/**
	 * Notfies the clearing status changed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AckToSettlementStateChanged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notfies the clearing status changed."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode AckToSettlementStateChanged = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AckToSettlementStateChanged";
			definition = "Notfies the clearing status changed.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "ATSC";
		}
	};
	/**
	 * Have no trading permissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatusCode
	 * AffirmStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTradingPrivilege"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Have no trading permissions."</li>
	 * </ul>
	 */
	public static final AffirmStatusCode NoTradingPrivilege = new AffirmStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTradingPrivilege";
			definition = "Have no trading permissions.";
			owner_lazy = () -> com.tools20022.repository.codeset.AffirmStatusCode.mmObject();
			codeName = "NOTP";
		}
	};
	final static private LinkedHashMap<String, AffirmStatusCode> codesByName = new LinkedHashMap<>();

	protected AffirmStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AffirmStatusCode";
				definition = "Identifies the status of the confirmation acknowledgement.";
				derivation_lazy = () -> Arrays.asList(AffirmStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AffirmStatusCode.Compared, com.tools20022.repository.codeset.AffirmStatusCode.Received, com.tools20022.repository.codeset.AffirmStatusCode.MisMatched,
						com.tools20022.repository.codeset.AffirmStatusCode.OutOfService, com.tools20022.repository.codeset.AffirmStatusCode.OutOfRange, com.tools20022.repository.codeset.AffirmStatusCode.AckToConfirmCompleteNotification,
						com.tools20022.repository.codeset.AffirmStatusCode.Unreceived, com.tools20022.repository.codeset.AffirmStatusCode.ModeError, com.tools20022.repository.codeset.AffirmStatusCode.AckToSettlementStateChanged,
						com.tools20022.repository.codeset.AffirmStatusCode.NoTradingPrivilege);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Compared.getCodeName().get(), Compared);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(MisMatched.getCodeName().get(), MisMatched);
		codesByName.put(OutOfService.getCodeName().get(), OutOfService);
		codesByName.put(OutOfRange.getCodeName().get(), OutOfRange);
		codesByName.put(AckToConfirmCompleteNotification.getCodeName().get(), AckToConfirmCompleteNotification);
		codesByName.put(Unreceived.getCodeName().get(), Unreceived);
		codesByName.put(ModeError.getCodeName().get(), ModeError);
		codesByName.put(AckToSettlementStateChanged.getCodeName().get(), AckToSettlementStateChanged);
		codesByName.put(NoTradingPrivilege.getCodeName().get(), NoTradingPrivilege);
	}

	public static AffirmStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AffirmStatusCode[] values() {
		AffirmStatusCode[] values = new AffirmStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AffirmStatusCode> {
		@Override
		public AffirmStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AffirmStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}