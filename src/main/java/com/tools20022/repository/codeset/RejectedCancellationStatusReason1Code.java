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
import com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason for which a cancellation is rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code#InvalidOrUnrecognisedReference
 * RejectedCancellationStatusReason1Code.InvalidOrUnrecognisedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code#NoCancellationMatch
 * RejectedCancellationStatusReason1Code.NoCancellationMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code#NotCompliantWithSLA
 * RejectedCancellationStatusReason1Code.NotCompliantWithSLA}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
 * RejectedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REFE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedCancellationStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for which a cancellation is rejected."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedCancellationStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code
	 * RejectedCancellationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrUnrecognisedReference"</li>
	 * </ul>
	 */
	public static final RejectedCancellationStatusReason1Code InvalidOrUnrecognisedReference = new RejectedCancellationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrUnrecognisedReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidOrUnrecognisedReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code
	 * RejectedCancellationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCancellationMatch"</li>
	 * </ul>
	 */
	public static final RejectedCancellationStatusReason1Code NoCancellationMatch = new RejectedCancellationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.NoCancellationMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code
	 * RejectedCancellationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final RejectedCancellationStatusReason1Code NotCompliantWithSLA = new RejectedCancellationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectedCancellationStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected RejectedCancellationStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedCancellationStatusReason1Code";
				definition = "Reason for which a cancellation is rejected.";
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.InvalidOrUnrecognisedReference,
						com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.NoCancellationMatch, com.tools20022.repository.codeset.RejectedCancellationStatusReason1Code.NotCompliantWithSLA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvalidOrUnrecognisedReference.getCodeName().get(), InvalidOrUnrecognisedReference);
		codesByName.put(NoCancellationMatch.getCodeName().get(), NoCancellationMatch);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
	}

	public static RejectedCancellationStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedCancellationStatusReason1Code[] values() {
		RejectedCancellationStatusReason1Code[] values = new RejectedCancellationStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedCancellationStatusReason1Code> {
		@Override
		public RejectedCancellationStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedCancellationStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}