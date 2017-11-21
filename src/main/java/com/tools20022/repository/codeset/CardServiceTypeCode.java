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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of administrative service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmCheckPoint
 * CardServiceTypeCode.mmCheckPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmFinal
 * CardServiceTypeCode.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmTotalInquiry
 * CardServiceTypeCode.mmTotalInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmDisableStoreForward
 * CardServiceTypeCode.mmDisableStoreForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmEchoTest
 * CardServiceTypeCode.mmEchoTest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmEnableStoreForward
 * CardServiceTypeCode.mmEnableStoreForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmSignOn
 * CardServiceTypeCode.mmSignOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmSignOff
 * CardServiceTypeCode.mmSignOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmKeyChange
 * CardServiceTypeCode.mmKeyChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmDeliverKey
 * CardServiceTypeCode.mmDeliverKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#mmKeyVerification
 * CardServiceTypeCode.mmKeyVerification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceType2Code
 * CardServiceType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceType1Code
 * CardServiceType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceType3Code
 * CardServiceType3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardServiceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of administrative service."</li>
 * </ul>
 */
public class CardServiceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Partial reconciliation of the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial reconciliation of the day."</li>
	 * </ul>
	 */
	public static final MMCode mmCheckPoint = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckPoint";
			definition = "Partial reconciliation of the day.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Final reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final reconciliation."</li>
	 * </ul>
	 */
	public static final MMCode mmFinal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Final reconciliation.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Request for totals of a previous reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for totals of a previous reconciliation."</li>
	 * </ul>
	 */
	public static final MMCode mmTotalInquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInquiry";
			definition = "Request for totals of a previous reconciliation.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "PRVS";
		}
	};
	/**
	 * Close communication at application level to stop store and forward
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisableStoreForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Close communication at application level to stop store and forward process."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisableStoreForward = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisableStoreForward";
			definition = "Close communication at application level to stop store and forward process.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "SFDS";
		}
	};
	/**
	 * Detection whether communication at application level is still active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EchoTest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detection whether communication at application level is still active."</li>
	 * </ul>
	 */
	public static final MMCode mmEchoTest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EchoTest";
			definition = "Detection whether communication at application level is still active.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "ECHO";
		}
	};
	/**
	 * Establish communication at application level to start store and forward
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnableStoreForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Establish communication at application level to start store and forward process."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEnableStoreForward = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnableStoreForward";
			definition = "Establish communication at application level to start store and forward process.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "SFEN";
		}
	};
	/**
	 * Establish communication at application level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGNN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Establish communication at application level."</li>
	 * </ul>
	 */
	public static final MMCode mmSignOn = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOn";
			definition = "Establish communication at application level.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "SGNN";
		}
	};
	/**
	 * Terminate communication at application level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminate communication at application level."</li>
	 * </ul>
	 */
	public static final MMCode mmSignOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOff";
			definition = "Terminate communication at application level.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "SGNF";
		}
	};
	/**
	 * Request the keys that the receiver must send in the response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request the keys that the receiver must send in the response."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyChange";
			definition = "Request the keys that the receiver must send in the response.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "KYCG";
		}
	};
	/**
	 * Deliver the key to be change by the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deliver the key to be change by the receiver."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverKey = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverKey";
			definition = "Deliver the key to be change by the receiver.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "KYDL";
		}
	};
	/**
	 * Request the receiver to verify the key check value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request the receiver to verify the key check value."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyVerification";
			definition = "Request the receiver to verify the key check value.";
			owner_lazy = () -> CardServiceTypeCode.mmObject();
			codeName = "KYVF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardServiceTypeCode";
				definition = "Type of administrative service.";
				code_lazy = () -> Arrays.asList(CardServiceTypeCode.mmCheckPoint, CardServiceTypeCode.mmFinal, CardServiceTypeCode.mmTotalInquiry, CardServiceTypeCode.mmDisableStoreForward, CardServiceTypeCode.mmEchoTest,
						CardServiceTypeCode.mmEnableStoreForward, CardServiceTypeCode.mmSignOn, CardServiceTypeCode.mmSignOff, CardServiceTypeCode.mmKeyChange, CardServiceTypeCode.mmDeliverKey, CardServiceTypeCode.mmKeyVerification);
				derivation_lazy = () -> Arrays.asList(CardServiceType2Code.mmObject(), CardServiceType1Code.mmObject(), CardServiceType3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}