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
import com.tools20022.repository.codeset.ResponseLevel1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the level of response requested from the receiver of the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code#NoAcknowledgement
 * ResponseLevel1Code.NoAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code#AcknowledgementNegativeError
 * ResponseLevel1Code.AcknowledgementNegativeError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code#AcknowledgementEach
 * ResponseLevel1Code.AcknowledgementEach}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResponseLevelCode
 * ResponseLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResponseLevel1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the level of response requested from the receiver of the message."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResponseLevel1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code
	 * ResponseLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAcknowledgement"</li>
	 * </ul>
	 */
	public static final ResponseLevel1Code NoAcknowledgement = new ResponseLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAcknowledgement";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseLevel1Code.mmObject();
			codeName = ResponseLevelCode.NoAcknowledgement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code
	 * ResponseLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementNegativeError"</li>
	 * </ul>
	 */
	public static final ResponseLevel1Code AcknowledgementNegativeError = new ResponseLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementNegativeError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseLevel1Code.mmObject();
			codeName = ResponseLevelCode.AcknowledgementNegativeError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResponseLevel1Code
	 * ResponseLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementEach"</li>
	 * </ul>
	 */
	public static final ResponseLevel1Code AcknowledgementEach = new ResponseLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementEach";
			owner_lazy = () -> com.tools20022.repository.codeset.ResponseLevel1Code.mmObject();
			codeName = ResponseLevelCode.AcknowledgementEach.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ResponseLevel1Code> codesByName = new LinkedHashMap<>();

	protected ResponseLevel1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseLevel1Code";
				definition = "Specifies the level of response requested from the receiver of the message.";
				trace_lazy = () -> ResponseLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResponseLevel1Code.NoAcknowledgement, com.tools20022.repository.codeset.ResponseLevel1Code.AcknowledgementNegativeError,
						com.tools20022.repository.codeset.ResponseLevel1Code.AcknowledgementEach);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoAcknowledgement.getCodeName().get(), NoAcknowledgement);
		codesByName.put(AcknowledgementNegativeError.getCodeName().get(), AcknowledgementNegativeError);
		codesByName.put(AcknowledgementEach.getCodeName().get(), AcknowledgementEach);
	}

	public static ResponseLevel1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResponseLevel1Code[] values() {
		ResponseLevel1Code[] values = new ResponseLevel1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResponseLevel1Code> {
		@Override
		public ResponseLevel1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResponseLevel1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}