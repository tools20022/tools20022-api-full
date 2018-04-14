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
import com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Lists the type of the securities account specific for a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode#CSDParticipantAccount
 * SystemSecuritiesAccountTypeCode.CSDParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode#CSDMirrorAccount
 * SystemSecuritiesAccountTypeCode.CSDMirrorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode#InterCSDAccount
 * SystemSecuritiesAccountTypeCode.InterCSDAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode#TechnicalOffsetAccount
 * SystemSecuritiesAccountTypeCode.TechnicalOffsetAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode#CSDOmnibusAccount
 * SystemSecuritiesAccountTypeCode.CSDOmnibusAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode#IssuanceAccount
 * SystemSecuritiesAccountTypeCode.IssuanceAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
 * SystemSecuritiesAccountType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemSecuritiesAccountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Lists the type of the securities account specific for a system."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CSDP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemSecuritiesAccountTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account owned by a CSD Participant .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
	 * SystemSecuritiesAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDParticipantAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owned by a CSD Participant\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemSecuritiesAccountTypeCode CSDParticipantAccount = new SystemSecuritiesAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			definition = "Account owned by a CSD Participant\n.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.mmObject();
			codeName = "CSDP";
		}
	};
	/**
	 * Account operated by CSD for mirroring positions .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
	 * SystemSecuritiesAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDMirrorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account operated by CSD for mirroring positions\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemSecuritiesAccountTypeCode CSDMirrorAccount = new SystemSecuritiesAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			definition = "Account operated by CSD for mirroring positions\n.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.mmObject();
			codeName = "CSDM";
		}
	};
	/**
	 * Account operated by CSD for settlement of securities legs for
	 * instructions involving internal CSD s.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
	 * SystemSecuritiesAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICSA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCSDAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by CSD for settlement of securities legs for instructions involving internal CSD s."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemSecuritiesAccountTypeCode InterCSDAccount = new SystemSecuritiesAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			definition = "Account operated by CSD for settlement of securities legs for instructions involving internal CSD s.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.mmObject();
			codeName = "ICSA";
		}
	};
	/**
	 * Account operated by CSDs in a direct holding market context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
	 * SystemSecuritiesAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOFF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalOffsetAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by CSDs in a direct holding market context."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemSecuritiesAccountTypeCode TechnicalOffsetAccount = new SystemSecuritiesAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			definition = "Account operated by CSDs in a direct holding market context.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.mmObject();
			codeName = "TOFF";
		}
	};
	/**
	 * Account operated by CSD in cross-CSD settlement context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
	 * SystemSecuritiesAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOmnibusAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account operated by CSD in cross-CSD settlement context."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemSecuritiesAccountTypeCode CSDOmnibusAccount = new SystemSecuritiesAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			definition = "Account operated by CSD in cross-CSD settlement context.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.mmObject();
			codeName = "CSDO";
		}
	};
	/**
	 * Account reflecting the holdings of the participants of the issuer CSD for
	 * a given financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
	 * SystemSecuritiesAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account reflecting the holdings of the participants of the issuer CSD for a given financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemSecuritiesAccountTypeCode IssuanceAccount = new SystemSecuritiesAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account reflecting the holdings of the participants of the issuer CSD for a given financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.mmObject();
			codeName = "ISSA";
		}
	};
	final static private LinkedHashMap<String, SystemSecuritiesAccountTypeCode> codesByName = new LinkedHashMap<>();

	protected SystemSecuritiesAccountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CSDP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemSecuritiesAccountTypeCode";
				definition = "Lists the type of the securities account specific for a system.";
				derivation_lazy = () -> Arrays.asList(SystemSecuritiesAccountType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.CSDParticipantAccount, com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.CSDMirrorAccount,
						com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.InterCSDAccount, com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.TechnicalOffsetAccount,
						com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.CSDOmnibusAccount, com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode.IssuanceAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CSDParticipantAccount.getCodeName().get(), CSDParticipantAccount);
		codesByName.put(CSDMirrorAccount.getCodeName().get(), CSDMirrorAccount);
		codesByName.put(InterCSDAccount.getCodeName().get(), InterCSDAccount);
		codesByName.put(TechnicalOffsetAccount.getCodeName().get(), TechnicalOffsetAccount);
		codesByName.put(CSDOmnibusAccount.getCodeName().get(), CSDOmnibusAccount);
		codesByName.put(IssuanceAccount.getCodeName().get(), IssuanceAccount);
	}

	public static SystemSecuritiesAccountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemSecuritiesAccountTypeCode[] values() {
		SystemSecuritiesAccountTypeCode[] values = new SystemSecuritiesAccountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemSecuritiesAccountTypeCode> {
		@Override
		public SystemSecuritiesAccountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemSecuritiesAccountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}