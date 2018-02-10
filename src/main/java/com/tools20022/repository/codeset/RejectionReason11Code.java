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
import com.tools20022.repository.codeset.RejectionReason11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of the notification cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code#FailedValidation
 * RejectionReason11Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code#RejectedSinceAlreadyCancelled
 * RejectionReason11Code.RejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code#RejectedSinceInProgress
 * RejectionReason11Code.RejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code#InvalidCAIdentification
 * RejectionReason11Code.InvalidCAIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of a rejection of the notification cancellation request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code
	 * RejectionReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason11Code FailedValidation = new RejectionReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason11Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code
	 * RejectionReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * </ul>
	 */
	public static final RejectionReason11Code RejectedSinceAlreadyCancelled = new RejectionReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason11Code.mmObject();
			codeName = RejectionReasonCode.RejectedSinceAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code
	 * RejectionReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * </ul>
	 */
	public static final RejectionReason11Code RejectedSinceInProgress = new RejectionReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason11Code.mmObject();
			codeName = RejectionReasonCode.RejectedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason11Code
	 * RejectionReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason11Code InvalidCAIdentification = new RejectionReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason11Code.mmObject();
			codeName = RejectionReasonCode.InvalidCAIdentification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason11Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason11Code";
				definition = "Specifies the reason of a rejection of the notification cancellation request.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason11Code.FailedValidation, com.tools20022.repository.codeset.RejectionReason11Code.RejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReason11Code.RejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReason11Code.InvalidCAIdentification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(RejectedSinceAlreadyCancelled.getCodeName().get(), RejectedSinceAlreadyCancelled);
		codesByName.put(RejectedSinceInProgress.getCodeName().get(), RejectedSinceInProgress);
		codesByName.put(InvalidCAIdentification.getCodeName().get(), InvalidCAIdentification);
	}

	public static RejectionReason11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason11Code[] values() {
		RejectionReason11Code[] values = new RejectionReason11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason11Code> {
		@Override
		public RejectionReason11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}