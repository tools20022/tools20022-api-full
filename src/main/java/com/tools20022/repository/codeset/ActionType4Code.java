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
import com.tools20022.repository.codeset.ActionType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Recommended action for the issuer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType4Code#CaptureCard
 * ActionType4Code.CaptureCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType4Code#IdentificationRequired
 * ActionType4Code.IdentificationRequired}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType4Code#Referral
 * ActionType4Code.Referral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType4Code#Approve
 * ActionType4Code.Approve}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType4Code#BlockCard
 * ActionType4Code.BlockCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType4Code#NoReasonForDecline
 * ActionType4Code.NoReasonForDecline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode ActionTypeCode}</li>
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
 * "ActionType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Recommended action for the issuer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ActionType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureCard"</li>
	 * </ul>
	 */
	public static final ActionType4Code CaptureCard = new ActionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType4Code.mmObject();
			codeName = ActionTypeCode.CaptureCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationRequired"</li>
	 * </ul>
	 */
	public static final ActionType4Code IdentificationRequired = new ActionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType4Code.mmObject();
			codeName = ActionTypeCode.IdentificationRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referral"</li>
	 * </ul>
	 */
	public static final ActionType4Code Referral = new ActionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referral";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType4Code.mmObject();
			codeName = ActionTypeCode.Referral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approve"</li>
	 * </ul>
	 */
	public static final ActionType4Code Approve = new ActionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approve";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType4Code.mmObject();
			codeName = ActionTypeCode.Approve.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockCard"</li>
	 * </ul>
	 */
	public static final ActionType4Code BlockCard = new ActionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType4Code.mmObject();
			codeName = ActionTypeCode.BlockCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType4Code
	 * ActionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReasonForDecline"</li>
	 * </ul>
	 */
	public static final ActionType4Code NoReasonForDecline = new ActionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReasonForDecline";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionType4Code.mmObject();
			codeName = ActionTypeCode.NoReasonForDecline.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ActionType4Code> codesByName = new LinkedHashMap<>();

	protected ActionType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionType4Code";
				definition = "Recommended action for the issuer.";
				trace_lazy = () -> ActionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType4Code.CaptureCard, com.tools20022.repository.codeset.ActionType4Code.IdentificationRequired,
						com.tools20022.repository.codeset.ActionType4Code.Referral, com.tools20022.repository.codeset.ActionType4Code.Approve, com.tools20022.repository.codeset.ActionType4Code.BlockCard,
						com.tools20022.repository.codeset.ActionType4Code.NoReasonForDecline);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CaptureCard.getCodeName().get(), CaptureCard);
		codesByName.put(IdentificationRequired.getCodeName().get(), IdentificationRequired);
		codesByName.put(Referral.getCodeName().get(), Referral);
		codesByName.put(Approve.getCodeName().get(), Approve);
		codesByName.put(BlockCard.getCodeName().get(), BlockCard);
		codesByName.put(NoReasonForDecline.getCodeName().get(), NoReasonForDecline);
	}

	public static ActionType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ActionType4Code[] values() {
		ActionType4Code[] values = new ActionType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ActionType4Code> {
		@Override
		public ActionType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ActionType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}