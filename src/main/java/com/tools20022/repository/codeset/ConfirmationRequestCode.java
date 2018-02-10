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
import com.tools20022.repository.codeset.ConfirmationRequestCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode#Status
 * ConfirmationRequestCode.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode#Confirmation
 * ConfirmationRequestCode.Confirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode#ConfirmationRequestRejected
 * ConfirmationRequestCode.ConfirmationRequestRejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code
 * ConfirmationRequest1Code}</li>
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
 * "ConfirmationRequestCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of confirmation message being sent."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConfirmationRequestCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * To inquire about the status of the trade confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode
	 * ConfirmationRequestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "To inquire about the status of the trade confirmation."</li>
	 * </ul>
	 */
	public static final ConfirmationRequestCode Status = new ConfirmationRequestCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "To inquire about the status of the trade confirmation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationRequestCode.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * To confirm the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode
	 * ConfirmationRequestCode}</li>
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
	 * definition} = "To confirm the trade."</li>
	 * </ul>
	 */
	public static final ConfirmationRequestCode Confirmation = new ConfirmationRequestCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "To confirm the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationRequestCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * To reject the confirmation of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequestCode
	 * ConfirmationRequestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRequestRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "To reject the confirmation of the trade."</li>
	 * </ul>
	 */
	public static final ConfirmationRequestCode ConfirmationRequestRejected = new ConfirmationRequestCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationRequestRejected";
			definition = "To reject the confirmation of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationRequestCode.mmObject();
			codeName = "CNRR";
		}
	};
	final static private LinkedHashMap<String, ConfirmationRequestCode> codesByName = new LinkedHashMap<>();

	protected ConfirmationRequestCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationRequestCode";
				definition = "Identifies the type of confirmation message being sent.";
				derivation_lazy = () -> Arrays.asList(ConfirmationRequest1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConfirmationRequestCode.Status, com.tools20022.repository.codeset.ConfirmationRequestCode.Confirmation,
						com.tools20022.repository.codeset.ConfirmationRequestCode.ConfirmationRequestRejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Status.getCodeName().get(), Status);
		codesByName.put(Confirmation.getCodeName().get(), Confirmation);
		codesByName.put(ConfirmationRequestRejected.getCodeName().get(), ConfirmationRequestRejected);
	}

	public static ConfirmationRequestCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConfirmationRequestCode[] values() {
		ConfirmationRequestCode[] values = new ConfirmationRequestCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConfirmationRequestCode> {
		@Override
		public ConfirmationRequestCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConfirmationRequestCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}