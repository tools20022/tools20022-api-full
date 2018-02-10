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
import com.tools20022.repository.codeset.TransferInFunction2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the function of the transfer in confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferInFunction2Code#Confirmation
 * TransferInFunction2Code.Confirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferInFunction2Code#Advice
 * TransferInFunction2Code.Advice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode
 * TransferInFunctionCode}</li>
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
 * "TransferInFunction2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the function of the transfer in confirmation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferInFunction2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunction2Code
	 * TransferInFunction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * </ul>
	 */
	public static final TransferInFunction2Code Confirmation = new TransferInFunction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferInFunction2Code.mmObject();
			codeName = TransferInFunctionCode.Confirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunction2Code
	 * TransferInFunction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advice"</li>
	 * </ul>
	 */
	public static final TransferInFunction2Code Advice = new TransferInFunction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Advice";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferInFunction2Code.mmObject();
			codeName = TransferInFunctionCode.Advice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransferInFunction2Code> codesByName = new LinkedHashMap<>();

	protected TransferInFunction2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInFunction2Code";
				definition = "Specifies the function of the transfer in confirmation.";
				trace_lazy = () -> TransferInFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferInFunction2Code.Confirmation, com.tools20022.repository.codeset.TransferInFunction2Code.Advice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Confirmation.getCodeName().get(), Confirmation);
		codesByName.put(Advice.getCodeName().get(), Advice);
	}

	public static TransferInFunction2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferInFunction2Code[] values() {
		TransferInFunction2Code[] values = new TransferInFunction2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferInFunction2Code> {
		@Override
		public TransferInFunction2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferInFunction2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}