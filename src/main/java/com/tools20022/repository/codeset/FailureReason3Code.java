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
import com.tools20022.repository.codeset.FailureReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * List of incidents happening at the acceptor during the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#CardDeclined
 * FailureReason3Code.CardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#CustomerCancel
 * FailureReason3Code.CustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#Malfunction
 * FailureReason3Code.Malfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#OfflineDeclined
 * FailureReason3Code.OfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#OnLineDeclined
 * FailureReason3Code.OnLineDeclined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailureReason3Code#Partial
 * FailureReason3Code.Partial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#SuspectedFraud
 * FailureReason3Code.SuspectedFraud}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailureReason3Code#TimeOut
 * FailureReason3Code.TimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#TooLateResponse
 * FailureReason3Code.TooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#UnableToComplete
 * FailureReason3Code.UnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#UnableToSend
 * FailureReason3Code.UnableToSend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code#SecurityError
 * FailureReason3Code.SecurityError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
 * FailureReasonCode}</li>
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
 * "FailureReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of incidents happening at the acceptor during the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code
 * FailureReason2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FailureReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#CardDeclined
	 * FailureReason2Code.CardDeclined}</li>
	 * </ul>
	 */
	public static final FailureReason3Code CardDeclined = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			previousVersion_lazy = () -> FailureReason2Code.CardDeclined;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.CardDeclined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#CustomerCancel
	 * FailureReason2Code.CustomerCancel}</li>
	 * </ul>
	 */
	public static final FailureReason3Code CustomerCancel = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			previousVersion_lazy = () -> FailureReason2Code.CustomerCancel;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.CustomerCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#Malfunction
	 * FailureReason2Code.Malfunction}</li>
	 * </ul>
	 */
	public static final FailureReason3Code Malfunction = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			previousVersion_lazy = () -> FailureReason2Code.Malfunction;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.Malfunction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#OfflineDeclined
	 * FailureReason2Code.OfflineDeclined}</li>
	 * </ul>
	 */
	public static final FailureReason3Code OfflineDeclined = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			previousVersion_lazy = () -> FailureReason2Code.OfflineDeclined;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.OfflineDeclined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#OnLineDeclined
	 * FailureReason2Code.OnLineDeclined}</li>
	 * </ul>
	 */
	public static final FailureReason3Code OnLineDeclined = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			previousVersion_lazy = () -> FailureReason2Code.OnLineDeclined;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.OnLineDeclined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#Partial
	 * FailureReason2Code.Partial}</li>
	 * </ul>
	 */
	public static final FailureReason3Code Partial = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			previousVersion_lazy = () -> FailureReason2Code.Partial;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.Partial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#SuspectedFraud
	 * FailureReason2Code.SuspectedFraud}</li>
	 * </ul>
	 */
	public static final FailureReason3Code SuspectedFraud = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			previousVersion_lazy = () -> FailureReason2Code.SuspectedFraud;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.SuspectedFraud.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#TimeOut
	 * FailureReason2Code.TimeOut}</li>
	 * </ul>
	 */
	public static final FailureReason3Code TimeOut = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			previousVersion_lazy = () -> FailureReason2Code.TimeOut;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.TimeOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#TooLateResponse
	 * FailureReason2Code.TooLateResponse}</li>
	 * </ul>
	 */
	public static final FailureReason3Code TooLateResponse = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			previousVersion_lazy = () -> FailureReason2Code.TooLateResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.TooLateResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#UnableToComplete
	 * FailureReason2Code.UnableToComplete}</li>
	 * </ul>
	 */
	public static final FailureReason3Code UnableToComplete = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			previousVersion_lazy = () -> FailureReason2Code.UnableToComplete;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.UnableToComplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToSend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason2Code#UnableToSend
	 * FailureReason2Code.UnableToSend}</li>
	 * </ul>
	 */
	public static final FailureReason3Code UnableToSend = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			previousVersion_lazy = () -> FailureReason2Code.UnableToSend;
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.UnableToSend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityError"</li>
	 * </ul>
	 */
	public static final FailureReason3Code SecurityError = new FailureReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityError";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason3Code.mmObject();
			codeName = FailureReasonCode.SecurityError.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FailureReason3Code> codesByName = new LinkedHashMap<>();

	protected FailureReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CDCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailureReason3Code";
				definition = "List of incidents happening at the acceptor during the transaction.";
				previousVersion_lazy = () -> FailureReason2Code.mmObject();
				trace_lazy = () -> FailureReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason3Code.CardDeclined, com.tools20022.repository.codeset.FailureReason3Code.CustomerCancel,
						com.tools20022.repository.codeset.FailureReason3Code.Malfunction, com.tools20022.repository.codeset.FailureReason3Code.OfflineDeclined, com.tools20022.repository.codeset.FailureReason3Code.OnLineDeclined,
						com.tools20022.repository.codeset.FailureReason3Code.Partial, com.tools20022.repository.codeset.FailureReason3Code.SuspectedFraud, com.tools20022.repository.codeset.FailureReason3Code.TimeOut,
						com.tools20022.repository.codeset.FailureReason3Code.TooLateResponse, com.tools20022.repository.codeset.FailureReason3Code.UnableToComplete, com.tools20022.repository.codeset.FailureReason3Code.UnableToSend,
						com.tools20022.repository.codeset.FailureReason3Code.SecurityError);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardDeclined.getCodeName().get(), CardDeclined);
		codesByName.put(CustomerCancel.getCodeName().get(), CustomerCancel);
		codesByName.put(Malfunction.getCodeName().get(), Malfunction);
		codesByName.put(OfflineDeclined.getCodeName().get(), OfflineDeclined);
		codesByName.put(OnLineDeclined.getCodeName().get(), OnLineDeclined);
		codesByName.put(Partial.getCodeName().get(), Partial);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(TimeOut.getCodeName().get(), TimeOut);
		codesByName.put(TooLateResponse.getCodeName().get(), TooLateResponse);
		codesByName.put(UnableToComplete.getCodeName().get(), UnableToComplete);
		codesByName.put(UnableToSend.getCodeName().get(), UnableToSend);
		codesByName.put(SecurityError.getCodeName().get(), SecurityError);
	}

	public static FailureReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FailureReason3Code[] values() {
		FailureReason3Code[] values = new FailureReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FailureReason3Code> {
		@Override
		public FailureReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FailureReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}