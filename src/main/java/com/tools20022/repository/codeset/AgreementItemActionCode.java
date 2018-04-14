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
import com.tools20022.repository.codeset.AgreementItemActionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of action concerning registration information.<br>
 * The default value is OPEN.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Deactivate
 * AgreementItemActionCode.Deactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Hold
 * AgreementItemActionCode.Hold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Modify
 * AgreementItemActionCode.Modify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Reactivate
 * AgreementItemActionCode.Reactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Register
 * AgreementItemActionCode.Register}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Synchronize
 * AgreementItemActionCode.Synchronize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode#Verify
 * AgreementItemActionCode.Verify}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
 * AgreementItemAction1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgreementItemActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of action concerning registration information.\r\nThe default value is OPEN."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AgreementItemActionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Deactivate agreement item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deactivate agreement item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Deactivate = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivate";
			definition = "Deactivate agreement item.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * Hold the agreement item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hold the agreement item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Hold = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hold";
			definition = "Hold the agreement item.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Modify agreement item information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDFY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modify agreement item information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Modify = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modify";
			definition = "Modify agreement item information.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "MDFY";
		}
	};
	/**
	 * Reactivate agreement item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reactivate agreement item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Reactivate = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reactivate";
			definition = "Reactivate agreement item.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "REAC";
		}
	};
	/**
	 * Register item as new agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Register"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Register item as new agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Register = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Register";
			definition = "Register item as new agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Send status with full agreement information details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYNC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Synchronize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Send status with full agreement information details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Synchronize = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Synchronize";
			definition = "Send status with full agreement information details.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "SYNC";
		}
	};
	/**
	 * Verify agreement item information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
	 * AgreementItemActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRFY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verify agreement item information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AgreementItemActionCode Verify = new AgreementItemActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verify";
			definition = "Verify agreement item information.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemActionCode.mmObject();
			codeName = "VRFY";
		}
	};
	final static private LinkedHashMap<String, AgreementItemActionCode> codesByName = new LinkedHashMap<>();

	protected AgreementItemActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreementItemActionCode";
				definition = "Specifies the type of action concerning registration information.\r\nThe default value is OPEN.";
				derivation_lazy = () -> Arrays.asList(AgreementItemAction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgreementItemActionCode.Deactivate, com.tools20022.repository.codeset.AgreementItemActionCode.Hold,
						com.tools20022.repository.codeset.AgreementItemActionCode.Modify, com.tools20022.repository.codeset.AgreementItemActionCode.Reactivate, com.tools20022.repository.codeset.AgreementItemActionCode.Register,
						com.tools20022.repository.codeset.AgreementItemActionCode.Synchronize, com.tools20022.repository.codeset.AgreementItemActionCode.Verify);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Deactivate.getCodeName().get(), Deactivate);
		codesByName.put(Hold.getCodeName().get(), Hold);
		codesByName.put(Modify.getCodeName().get(), Modify);
		codesByName.put(Reactivate.getCodeName().get(), Reactivate);
		codesByName.put(Register.getCodeName().get(), Register);
		codesByName.put(Synchronize.getCodeName().get(), Synchronize);
		codesByName.put(Verify.getCodeName().get(), Verify);
	}

	public static AgreementItemActionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AgreementItemActionCode[] values() {
		AgreementItemActionCode[] values = new AgreementItemActionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AgreementItemActionCode> {
		@Override
		public AgreementItemActionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AgreementItemActionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}