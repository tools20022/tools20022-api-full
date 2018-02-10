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
import com.tools20022.repository.codeset.Action1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which type of action a user should take.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Action1Code#SubmitTwin
 * Action1Code.SubmitTwin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Action1Code#ReSubmitTwin
 * Action1Code.ReSubmitTwin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#ReSubmitBaseline
 * Action1Code.ReSubmitBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#AcceptOrRejectDataSetMisMatches
 * Action1Code.AcceptOrRejectDataSetMisMatches}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#AcceptOrRejectChangeOfStatus
 * Action1Code.AcceptOrRejectChangeOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#AcceptOrRejectExtensionOfStatus
 * Action1Code.AcceptOrRejectExtensionOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#WaitForBaselineEstablished
 * Action1Code.WaitForBaselineEstablished}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#UpdateAndResend
 * Action1Code.UpdateAndResend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Action1Code#SubmitDataSet
 * Action1Code.SubmitDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action1Code#AcceptOrRejectBaselineAmendment
 * Action1Code.AcceptOrRejectBaselineAmendment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SBTW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Action1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies which type of action a user should take."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Action1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitTwin"</li>
	 * </ul>
	 */
	public static final Action1Code SubmitTwin = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitTwin";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.SubmitTwin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSubmitTwin"</li>
	 * </ul>
	 */
	public static final Action1Code ReSubmitTwin = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitTwin";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.ReSubmitTwin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSubmitBaseline"</li>
	 * </ul>
	 */
	public static final Action1Code ReSubmitBaseline = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitBaseline";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.ReSubmitBaseline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectDataSetMisMatches"</li>
	 * </ul>
	 */
	public static final Action1Code AcceptOrRejectDataSetMisMatches = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectDataSetMisMatches";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.AcceptOrRejectDataSetMisMatches.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectChangeOfStatus"</li>
	 * </ul>
	 */
	public static final Action1Code AcceptOrRejectChangeOfStatus = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectChangeOfStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.AcceptOrRejectChangeOfStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectExtensionOfStatus"</li>
	 * </ul>
	 */
	public static final Action1Code AcceptOrRejectExtensionOfStatus = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectExtensionOfStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.AcceptOrRejectExtensionOfStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitForBaselineEstablished"</li>
	 * </ul>
	 */
	public static final Action1Code WaitForBaselineEstablished = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitForBaselineEstablished";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.WaitForBaselineEstablished.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateAndResend"</li>
	 * </ul>
	 */
	public static final Action1Code UpdateAndResend = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateAndResend";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.UpdateAndResend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitDataSet"</li>
	 * </ul>
	 */
	public static final Action1Code SubmitDataSet = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitDataSet";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.SubmitDataSet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectBaselineAmendment"</li>
	 * </ul>
	 */
	public static final Action1Code AcceptOrRejectBaselineAmendment = new Action1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAmendment";
			owner_lazy = () -> com.tools20022.repository.codeset.Action1Code.mmObject();
			codeName = ActionCode.AcceptOrRejectBaselineAmendment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Action1Code> codesByName = new LinkedHashMap<>();

	protected Action1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SBTW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Action1Code";
				definition = "Specifies which type of action a user should take.";
				trace_lazy = () -> ActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Action1Code.SubmitTwin, com.tools20022.repository.codeset.Action1Code.ReSubmitTwin, com.tools20022.repository.codeset.Action1Code.ReSubmitBaseline,
						com.tools20022.repository.codeset.Action1Code.AcceptOrRejectDataSetMisMatches, com.tools20022.repository.codeset.Action1Code.AcceptOrRejectChangeOfStatus,
						com.tools20022.repository.codeset.Action1Code.AcceptOrRejectExtensionOfStatus, com.tools20022.repository.codeset.Action1Code.WaitForBaselineEstablished, com.tools20022.repository.codeset.Action1Code.UpdateAndResend,
						com.tools20022.repository.codeset.Action1Code.SubmitDataSet, com.tools20022.repository.codeset.Action1Code.AcceptOrRejectBaselineAmendment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SubmitTwin.getCodeName().get(), SubmitTwin);
		codesByName.put(ReSubmitTwin.getCodeName().get(), ReSubmitTwin);
		codesByName.put(ReSubmitBaseline.getCodeName().get(), ReSubmitBaseline);
		codesByName.put(AcceptOrRejectDataSetMisMatches.getCodeName().get(), AcceptOrRejectDataSetMisMatches);
		codesByName.put(AcceptOrRejectChangeOfStatus.getCodeName().get(), AcceptOrRejectChangeOfStatus);
		codesByName.put(AcceptOrRejectExtensionOfStatus.getCodeName().get(), AcceptOrRejectExtensionOfStatus);
		codesByName.put(WaitForBaselineEstablished.getCodeName().get(), WaitForBaselineEstablished);
		codesByName.put(UpdateAndResend.getCodeName().get(), UpdateAndResend);
		codesByName.put(SubmitDataSet.getCodeName().get(), SubmitDataSet);
		codesByName.put(AcceptOrRejectBaselineAmendment.getCodeName().get(), AcceptOrRejectBaselineAmendment);
	}

	public static Action1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Action1Code[] values() {
		Action1Code[] values = new Action1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Action1Code> {
		@Override
		public Action1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Action1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}