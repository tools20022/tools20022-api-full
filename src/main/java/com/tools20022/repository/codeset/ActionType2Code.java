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
import com.tools20022.repository.codeset.ActionType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of action to be performed by the point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType2Code#Busy
 * ActionType2Code.Busy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#CaptureCard
 * ActionType2Code.CaptureCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#DisplayMessage
 * ActionType2Code.DisplayMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#ForbidOverride
 * ActionType2Code.ForbidOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#IdentificationRequired
 * ActionType2Code.IdentificationRequired}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType2Code#PINLastTry
 * ActionType2Code.PINLastTry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType2Code#PINRetry
 * ActionType2Code.PINRetry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#PrintMessage
 * ActionType2Code.PrintMessage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType2Code#Referral
 * ActionType2Code.Referral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#RequestData
 * ActionType2Code.RequestData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode ActionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BUSY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActionType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of action to be performed by the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType3Code
 * ActionType3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ActionType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Busy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.ActionType3Code#Busy
	 * ActionType3Code.Busy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code Busy = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Busy";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.Busy);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.Busy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#CaptureCard
	 * ActionType3Code.CaptureCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code CaptureCard = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureCard";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.CaptureCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.CaptureCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayMessage"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#DisplayMessage
	 * ActionType3Code.DisplayMessage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code DisplayMessage = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayMessage";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.DisplayMessage);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.DisplayMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForbidOverride"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#ForbidOverride
	 * ActionType3Code.ForbidOverride}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code ForbidOverride = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForbidOverride";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.ForbidOverride);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.ForbidOverride.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationRequired"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#IdentificationRequired
	 * ActionType3Code.IdentificationRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code IdentificationRequired = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationRequired";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.IdentificationRequired);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.IdentificationRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINLastTry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#PINLastTry
	 * ActionType3Code.PINLastTry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code PINLastTry = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLastTry";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.PINLastTry);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.PINLastTry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRetry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#PINRetry
	 * ActionType3Code.PINRetry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code PINRetry = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRetry";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.PINRetry);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.PINRetry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintMessage"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#PrintMessage
	 * ActionType3Code.PrintMessage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code PrintMessage = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintMessage";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.PrintMessage);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.PrintMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referral"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#Referral
	 * ActionType3Code.Referral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code Referral = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referral";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.Referral);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.Referral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
	 * ActionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#RequestData
	 * ActionType3Code.RequestData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ActionType2Code RequestData = new ActionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestData";
			nextVersions_lazy = () -> Arrays.asList(ActionType3Code.RequestData);
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmObject();
			codeName = ActionTypeCode.RequestData.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ActionType2Code> codesByName = new LinkedHashMap<>();

	protected ActionType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUSY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionType2Code";
				definition = "Type of action to be performed by the point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(ActionType3Code.mmObject());
				trace_lazy = () -> ActionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType2Code.Busy, com.tools20022.repository.codeset.ActionType2Code.CaptureCard, com.tools20022.repository.codeset.ActionType2Code.DisplayMessage,
						com.tools20022.repository.codeset.ActionType2Code.ForbidOverride, com.tools20022.repository.codeset.ActionType2Code.IdentificationRequired, com.tools20022.repository.codeset.ActionType2Code.PINLastTry,
						com.tools20022.repository.codeset.ActionType2Code.PINRetry, com.tools20022.repository.codeset.ActionType2Code.PrintMessage, com.tools20022.repository.codeset.ActionType2Code.Referral,
						com.tools20022.repository.codeset.ActionType2Code.RequestData);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Busy.getCodeName().get(), Busy);
		codesByName.put(CaptureCard.getCodeName().get(), CaptureCard);
		codesByName.put(DisplayMessage.getCodeName().get(), DisplayMessage);
		codesByName.put(ForbidOverride.getCodeName().get(), ForbidOverride);
		codesByName.put(IdentificationRequired.getCodeName().get(), IdentificationRequired);
		codesByName.put(PINLastTry.getCodeName().get(), PINLastTry);
		codesByName.put(PINRetry.getCodeName().get(), PINRetry);
		codesByName.put(PrintMessage.getCodeName().get(), PrintMessage);
		codesByName.put(Referral.getCodeName().get(), Referral);
		codesByName.put(RequestData.getCodeName().get(), RequestData);
	}

	public static ActionType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ActionType2Code[] values() {
		ActionType2Code[] values = new ActionType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ActionType2Code> {
		@Override
		public ActionType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ActionType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}