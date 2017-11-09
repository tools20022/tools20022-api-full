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
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List of incidents happening at the acceptor during the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
 * FailureReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmCardDeclined
 * FailureReason2Code.mmCardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmCustomerCancel
 * FailureReason2Code.mmCustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmMalfunction
 * FailureReason2Code.mmMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmOfflineDeclined
 * FailureReason2Code.mmOfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmOnLineDeclined
 * FailureReason2Code.mmOnLineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmPartial
 * FailureReason2Code.mmPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmSuspectedFraud
 * FailureReason2Code.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmTimeOut
 * FailureReason2Code.mmTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmTooLateResponse
 * FailureReason2Code.mmTooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmUnableToComplete
 * FailureReason2Code.mmUnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#mmUnableToSend
 * FailureReason2Code.mmUnableToSend}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CDCL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FailureReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of incidents happening at the acceptor during the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FailureReason3Code
 * FailureReason3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class FailureReason2Code extends FailureReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDeclined"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmCardDeclined
	 * FailureReason3Code.mmCardDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmCardDeclined);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmCustomerCancel
	 * FailureReason3Code.mmCustomerCancel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustomerCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmCustomerCancel);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmMalfunction
	 * FailureReason3Code.mmMalfunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMalfunction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmMalfunction);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDeclined"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmOfflineDeclined
	 * FailureReason3Code.mmOfflineDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOfflineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmOfflineDeclined);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineDeclined"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmOnLineDeclined
	 * FailureReason3Code.mmOnLineDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOnLineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmOnLineDeclined);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmPartial
	 * FailureReason3Code.mmPartial}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmPartial);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmSuspectedFraud
	 * FailureReason3Code.mmSuspectedFraud}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmSuspectedFraud);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmTimeOut
	 * FailureReason3Code.mmTimeOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTimeOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmTimeOut);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmTooLateResponse
	 * FailureReason3Code.mmTooLateResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTooLateResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmTooLateResponse);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToComplete"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmUnableToComplete
	 * FailureReason3Code.mmUnableToComplete}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToComplete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmUnableToComplete);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
	 * FailureReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToSend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#mmUnableToSend
	 * FailureReason3Code.mmUnableToSend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToSend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmUnableToSend);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CDCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailureReason2Code";
				definition = "List of incidents happening at the acceptor during the transaction.";
				nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmObject());
				code_lazy = () -> Arrays.asList(FailureReason2Code.mmCardDeclined, FailureReason2Code.mmCustomerCancel, FailureReason2Code.mmMalfunction, FailureReason2Code.mmOfflineDeclined, FailureReason2Code.mmOnLineDeclined,
						FailureReason2Code.mmPartial, FailureReason2Code.mmSuspectedFraud, FailureReason2Code.mmTimeOut, FailureReason2Code.mmTooLateResponse, FailureReason2Code.mmUnableToComplete, FailureReason2Code.mmUnableToSend);
				trace_lazy = () -> FailureReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}