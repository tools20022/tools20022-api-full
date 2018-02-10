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
import com.tools20022.repository.codeset.TransferInFunctionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the function of the transfer in.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode#AdviceAndRequest
 * TransferInFunctionCode.AdviceAndRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode#Instruction
 * TransferInFunctionCode.Instruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode#Advice
 * TransferInFunctionCode.Advice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode#Confirmation
 * TransferInFunctionCode.Confirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferInFunction1Code
 * TransferInFunction1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferInFunction2Code
 * TransferInFunction2Code}</li>
 * </ul>
 * </li>
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
 * "TransferInFunctionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the function of the transfer in."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferInFunctionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The transfer-in is an advice and request, that is, the message is used to
	 * inform the receiver to expect an unsolicited transfer in confirmation and
	 * to request account information for the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode
	 * TransferInFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdviceAndRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The transfer-in is an advice and request, that is, the message is used to inform the receiver to expect an unsolicited transfer in confirmation and to request account information for the transfer."
	 * </li>
	 * </ul>
	 */
	public static final TransferInFunctionCode AdviceAndRequest = new TransferInFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdviceAndRequest";
			definition = "The transfer-in is an advice and request, that is, the message is used to inform the receiver to expect an unsolicited transfer in confirmation and to request account information for the transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferInFunctionCode.mmObject();
			codeName = "ADRE";
		}
	};
	/**
	 * The transfer-in is an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode
	 * TransferInFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transfer-in is an instruction."</li>
	 * </ul>
	 */
	public static final TransferInFunctionCode Instruction = new TransferInFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "The transfer-in is an instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferInFunctionCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * The transfer-in provides advice about account information for a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode
	 * TransferInFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The transfer-in provides advice about account information for a transfer."
	 * </li>
	 * </ul>
	 */
	public static final TransferInFunctionCode Advice = new TransferInFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Advice";
			definition = "The transfer-in provides advice about account information for a transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferInFunctionCode.mmObject();
			codeName = "ADVI";
		}
	};
	/**
	 * The transfer-in is a confirmation (rather than an advice).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunctionCode
	 * TransferInFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The transfer-in is a confirmation (rather than an advice)."</li>
	 * </ul>
	 */
	public static final TransferInFunctionCode Confirmation = new TransferInFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "The transfer-in is a confirmation (rather than an advice).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferInFunctionCode.mmObject();
			codeName = "CONF";
		}
	};
	final static private LinkedHashMap<String, TransferInFunctionCode> codesByName = new LinkedHashMap<>();

	protected TransferInFunctionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInFunctionCode";
				definition = "Specifies the function of the transfer in.";
				derivation_lazy = () -> Arrays.asList(TransferInFunction1Code.mmObject(), TransferInFunction2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferInFunctionCode.AdviceAndRequest, com.tools20022.repository.codeset.TransferInFunctionCode.Instruction,
						com.tools20022.repository.codeset.TransferInFunctionCode.Advice, com.tools20022.repository.codeset.TransferInFunctionCode.Confirmation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AdviceAndRequest.getCodeName().get(), AdviceAndRequest);
		codesByName.put(Instruction.getCodeName().get(), Instruction);
		codesByName.put(Advice.getCodeName().get(), Advice);
		codesByName.put(Confirmation.getCodeName().get(), Confirmation);
	}

	public static TransferInFunctionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferInFunctionCode[] values() {
		TransferInFunctionCode[] values = new TransferInFunctionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferInFunctionCode> {
		@Override
		public TransferInFunctionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferInFunctionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}