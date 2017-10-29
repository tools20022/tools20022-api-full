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
import com.tools20022.repository.codeset.FailureReasonCode;
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
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#CardDeclined
 * FailureReason2Code.CardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#CustomerCancel
 * FailureReason2Code.CustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#Malfunction
 * FailureReason2Code.Malfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#OfflineDeclined
 * FailureReason2Code.OfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#OnLineDeclined
 * FailureReason2Code.OnLineDeclined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailureReason2Code#Partial
 * FailureReason2Code.Partial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#SuspectedFraud
 * FailureReason2Code.SuspectedFraud}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailureReason2Code#TimeOut
 * FailureReason2Code.TimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#TooLateResponse
 * FailureReason2Code.TooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#UnableToComplete
 * FailureReason2Code.UnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#UnableToSend
 * FailureReason2Code.UnableToSend}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#CardDeclined
	 * FailureReason3Code.CardDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CardDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.CardDeclined);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#CustomerCancel
	 * FailureReason3Code.CustomerCancel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CustomerCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.CustomerCancel);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#Malfunction
	 * FailureReason3Code.Malfunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Malfunction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.Malfunction);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#OfflineDeclined
	 * FailureReason3Code.OfflineDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode OfflineDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.OfflineDeclined);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#OnLineDeclined
	 * FailureReason3Code.OnLineDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode OnLineDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.OnLineDeclined);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#Partial
	 * FailureReason3Code.Partial}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Partial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.Partial);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#SuspectedFraud
	 * FailureReason3Code.SuspectedFraud}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode SuspectedFraud = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.SuspectedFraud);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#TimeOut
	 * FailureReason3Code.TimeOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode TimeOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.TimeOut);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#TooLateResponse
	 * FailureReason3Code.TooLateResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode TooLateResponse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.TooLateResponse);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#UnableToComplete
	 * FailureReason3Code.UnableToComplete}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode UnableToComplete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.UnableToComplete);
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
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#UnableToSend
	 * FailureReason3Code.UnableToSend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode UnableToSend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.UnableToSend);
			owner_lazy = () -> FailureReason2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CDCL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FailureReason2Code";
				definition = "List of incidents happening at the acceptor during the transaction.";
				nextVersions_lazy = () -> Arrays.asList(FailureReason3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason2Code.CardDeclined, com.tools20022.repository.codeset.FailureReason2Code.CustomerCancel,
						com.tools20022.repository.codeset.FailureReason2Code.Malfunction, com.tools20022.repository.codeset.FailureReason2Code.OfflineDeclined, com.tools20022.repository.codeset.FailureReason2Code.OnLineDeclined,
						com.tools20022.repository.codeset.FailureReason2Code.Partial, com.tools20022.repository.codeset.FailureReason2Code.SuspectedFraud, com.tools20022.repository.codeset.FailureReason2Code.TimeOut,
						com.tools20022.repository.codeset.FailureReason2Code.TooLateResponse, com.tools20022.repository.codeset.FailureReason2Code.UnableToComplete, com.tools20022.repository.codeset.FailureReason2Code.UnableToSend);
				trace_lazy = () -> FailureReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}