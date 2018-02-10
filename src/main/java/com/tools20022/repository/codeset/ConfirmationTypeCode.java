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
import com.tools20022.repository.codeset.ConfirmationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether a message is an intention to execute a transfer instruction
 * or an actual confirmation of the execution of the transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationTypeCode#Intent
 * ConfirmationTypeCode.Intent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationTypeCode#Actual
 * ConfirmationTypeCode.Actual}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ConfirmationType1Code
 * ConfirmationType1Code}</li>
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
 * <li>"INTT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConfirmationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether a message is an intention to execute a transfer instruction or an actual confirmation of the execution of the transfer."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConfirmationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the confirmation is an intention to execute a transfer
	 * instruction for the listed assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationTypeCode
	 * ConfirmationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the confirmation is an intention to execute a transfer instruction for the listed assets."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationTypeCode Intent = new ConfirmationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intent";
			definition = "Specifies that the confirmation is an intention to execute a transfer instruction for the listed assets.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationTypeCode.mmObject();
			codeName = "INTT";
		}
	};
	/**
	 * Specifies that the message is an actual confirmation of the execution of
	 * a transfer request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationTypeCode
	 * ConfirmationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the message is an actual confirmation of the execution of a transfer request."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationTypeCode Actual = new ConfirmationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual";
			definition = "Specifies that the message is an actual confirmation of the execution of a transfer request.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationTypeCode.mmObject();
			codeName = "ACTL";
		}
	};
	final static private LinkedHashMap<String, ConfirmationTypeCode> codesByName = new LinkedHashMap<>();

	protected ConfirmationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationTypeCode";
				definition = "Specifies whether a message is an intention to execute a transfer instruction or an actual confirmation of the execution of the transfer.";
				derivation_lazy = () -> Arrays.asList(ConfirmationType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConfirmationTypeCode.Intent, com.tools20022.repository.codeset.ConfirmationTypeCode.Actual);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Intent.getCodeName().get(), Intent);
		codesByName.put(Actual.getCodeName().get(), Actual);
	}

	public static ConfirmationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConfirmationTypeCode[] values() {
		ConfirmationTypeCode[] values = new ConfirmationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConfirmationTypeCode> {
		@Override
		public ConfirmationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConfirmationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}