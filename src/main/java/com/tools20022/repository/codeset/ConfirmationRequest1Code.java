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
import com.tools20022.repository.codeset.ConfirmationRequest1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of confirmation message being sent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code#Confirmation
 * ConfirmationRequest1Code.Confirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code#ConfirmationRequestRejected
 * ConfirmationRequest1Code.ConfirmationRequestRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code#Status
 * ConfirmationRequest1Code.Status}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode
 * ConfirmationRequestCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConfirmationRequest1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of confirmation message being sent."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConfirmationRequest1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code
	 * ConfirmationRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConfirmationRequest1Code Confirmation = new ConfirmationRequest1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationRequest1Code.mmObject();
			codeName = ConfirmationRequestCode.Confirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code
	 * ConfirmationRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRequestRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConfirmationRequest1Code ConfirmationRequestRejected = new ConfirmationRequest1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationRequestRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationRequest1Code.mmObject();
			codeName = ConfirmationRequestCode.ConfirmationRequestRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code
	 * ConfirmationRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ConfirmationRequest1Code Status = new ConfirmationRequest1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationRequest1Code.mmObject();
			codeName = ConfirmationRequestCode.Status.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ConfirmationRequest1Code> codesByName = new LinkedHashMap<>();

	protected ConfirmationRequest1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationRequest1Code";
				definition = "Identifies the type of confirmation message being sent.";
				trace_lazy = () -> ConfirmationRequestCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConfirmationRequest1Code.Confirmation, com.tools20022.repository.codeset.ConfirmationRequest1Code.ConfirmationRequestRejected,
						com.tools20022.repository.codeset.ConfirmationRequest1Code.Status);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Confirmation.getCodeName().get(), Confirmation);
		codesByName.put(ConfirmationRequestRejected.getCodeName().get(), ConfirmationRequestRejected);
		codesByName.put(Status.getCodeName().get(), Status);
	}

	public static ConfirmationRequest1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConfirmationRequest1Code[] values() {
		ConfirmationRequest1Code[] values = new ConfirmationRequest1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConfirmationRequest1Code> {
		@Override
		public ConfirmationRequest1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConfirmationRequest1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}