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
import com.tools20022.repository.codeset.AgreementItemAction1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Deactivate
 * AgreementItemAction1Code.Deactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Hold
 * AgreementItemAction1Code.Hold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Modify
 * AgreementItemAction1Code.Modify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Reactivate
 * AgreementItemAction1Code.Reactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Register
 * AgreementItemAction1Code.Register}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Synchronize
 * AgreementItemAction1Code.Synchronize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code#Verify
 * AgreementItemAction1Code.Verify}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AgreementItemActionCode
 * AgreementItemActionCode}</li>
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
 * "AgreementItemAction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of action concerning registration information.\r\nThe default value is OPEN."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AgreementItemAction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Deactivate agreement item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deactivate agreement item."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Deactivate = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivate";
			definition = "Deactivate agreement item.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "DEAC";
			codeName = AgreementItemActionCode.Deactivate.getCodeName().orElse(name);
		}
	};
	/**
	 * Hold the agreement item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hold the agreement item."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Hold = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hold";
			definition = "Hold the agreement item.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "HOLD";
			codeName = AgreementItemActionCode.Hold.getCodeName().orElse(name);
		}
	};
	/**
	 * Modify agreement item information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDFY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modify agreement item information."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Modify = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modify";
			definition = "Modify agreement item information.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "MDFY";
			codeName = AgreementItemActionCode.Modify.getCodeName().orElse(name);
		}
	};
	/**
	 * Reactivate agreement item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reactivate agreement item."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Reactivate = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reactivate";
			definition = "Reactivate agreement item.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "REAC";
			codeName = AgreementItemActionCode.Reactivate.getCodeName().orElse(name);
		}
	};
	/**
	 * Register item as new agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Register"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Register item as new agreement."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Register = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Register";
			definition = "Register item as new agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "OPEN";
			codeName = AgreementItemActionCode.Register.getCodeName().orElse(name);
		}
	};
	/**
	 * Send status with full agreement information details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Synchronize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Send status with full agreement information details."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Synchronize = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Synchronize";
			definition = "Send status with full agreement information details.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "SYNC";
			codeName = AgreementItemActionCode.Synchronize.getCodeName().orElse(name);
		}
	};
	/**
	 * Verify agreement item information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRFY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verify agreement item information."</li>
	 * </ul>
	 */
	public static final AgreementItemAction1Code Verify = new AgreementItemAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verify";
			definition = "Verify agreement item information.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementItemAction1Code.mmObject();
			codeName = "VRFY";
			codeName = AgreementItemActionCode.Verify.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AgreementItemAction1Code> codesByName = new LinkedHashMap<>();

	protected AgreementItemAction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreementItemAction1Code";
				definition = "Specifies the type of action concerning registration information.\r\nThe default value is OPEN.";
				trace_lazy = () -> AgreementItemActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgreementItemAction1Code.Deactivate, com.tools20022.repository.codeset.AgreementItemAction1Code.Hold,
						com.tools20022.repository.codeset.AgreementItemAction1Code.Modify, com.tools20022.repository.codeset.AgreementItemAction1Code.Reactivate, com.tools20022.repository.codeset.AgreementItemAction1Code.Register,
						com.tools20022.repository.codeset.AgreementItemAction1Code.Synchronize, com.tools20022.repository.codeset.AgreementItemAction1Code.Verify);
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

	public static AgreementItemAction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AgreementItemAction1Code[] values() {
		AgreementItemAction1Code[] values = new AgreementItemAction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AgreementItemAction1Code> {
		@Override
		public AgreementItemAction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AgreementItemAction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}