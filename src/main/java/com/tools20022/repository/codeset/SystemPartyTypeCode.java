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
import com.tools20022.repository.codeset.SystemPartyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the party within a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode#CentralSecuritiesDepository
 * SystemPartyTypeCode.CentralSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode#NationalCentralBank
 * SystemPartyTypeCode.NationalCentralBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode#PaymentBank
 * SystemPartyTypeCode.PaymentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode#CentralSecuritiesDepositoryParticipant
 * SystemPartyTypeCode.CentralSecuritiesDepositoryParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode#ExternalCentralSecuritiesDepository
 * SystemPartyTypeCode.ExternalCentralSecuritiesDepository}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
 * SystemPartyType1Code}</li>
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
 * <li>"CSDY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemPartyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the party within a system."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemPartyTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Infrastructure that holds or controls the holding of physical or
	 * dematerialised financial instruments belonging to all, or a large portion
	 * of, the investors in a securities market. This effects the centralised
	 * transfer of ownership of such securities by entries on its books and
	 * records.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode
	 * SystemPartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure that holds or controls the holding of physical or dematerialised financial instruments belonging to all, or a large portion of, the investors in a securities market. This effects the centralised transfer of ownership of such securities by entries on its books and records."
	 * </li>
	 * </ul>
	 */
	public static final SystemPartyTypeCode CentralSecuritiesDepository = new SystemPartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepository";
			definition = "Infrastructure that holds or controls the holding of physical or dematerialised financial instruments belonging to all, or a large portion of, the investors in a securities market. This effects the centralised transfer of ownership of such securities by entries on its books and records.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyTypeCode.mmObject();
			codeName = "CSDY";
		}
	};
	/**
	 * As system participant, the national central bank is the principal
	 * monetary authority of a nation and performs several key functions,
	 * including issuing currency and regulating the supply of credit in the
	 * economy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode
	 * SystemPartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalCentralBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As system participant, the national central bank is the principal monetary authority of a nation and performs several key functions, including issuing currency and regulating the supply of credit in the economy."
	 * </li>
	 * </ul>
	 */
	public static final SystemPartyTypeCode NationalCentralBank = new SystemPartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalCentralBank";
			definition = "As system participant, the national central bank is the principal monetary authority of a nation and performs several key functions, including issuing currency and regulating the supply of credit in the economy.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyTypeCode.mmObject();
			codeName = "NCBK";
		}
	};
	/**
	 * National central bank or a private bank used to settle the cash leg of
	 * securities settlements: it provides the cash account to support the
	 * settlement of the securities transactions of another financial
	 * institution in central bank money (CeBM).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode
	 * SystemPartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PMBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "National central bank or a private bank used to settle the cash leg of securities settlements: it provides the cash account to support the settlement of the securities transactions of another financial institution in central bank money (CeBM)."
	 * </li>
	 * </ul>
	 */
	public static final SystemPartyTypeCode PaymentBank = new SystemPartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentBank";
			definition = "National central bank or a private bank used to settle the cash leg of securities settlements: it provides the cash account to support the settlement of the securities transactions of another financial institution in central bank money (CeBM).";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyTypeCode.mmObject();
			codeName = "PMBK";
		}
	};
	/**
	 * Participant of a central securities depositary defined within the system,
	 * for which the account holder is the central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode
	 * SystemPartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepositoryParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant of a central securities depositary defined within the system, for which the account holder is the central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final SystemPartyTypeCode CentralSecuritiesDepositoryParticipant = new SystemPartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepositoryParticipant";
			definition = "Participant of a central securities depositary defined within the system, for which the account holder is the central securities depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyTypeCode.mmObject();
			codeName = "CSDP";
		}
	};
	/**
	 * Infrastructure that holds or controls the holding of physical or
	 * dematerialised financial instruments belonging to all, or a large portion
	 * of, the investors in a securities market. This effects the centralised
	 * transfer of ownership of such securities by entries on its books and
	 * records.<br>
	 * The infrastructure is external to the system executing the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode
	 * SystemPartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalCentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure that holds or controls the holding of physical or dematerialised financial instruments belonging to all, or a large portion of, the investors in a securities market. This effects the centralised transfer of ownership of such securities by entries on its books and records.\r\nThe infrastructure is external to the system executing the instruction."
	 * </li>
	 * </ul>
	 */
	public static final SystemPartyTypeCode ExternalCentralSecuritiesDepository = new SystemPartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalCentralSecuritiesDepository";
			definition = "Infrastructure that holds or controls the holding of physical or dematerialised financial instruments belonging to all, or a large portion of, the investors in a securities market. This effects the centralised transfer of ownership of such securities by entries on its books and records.\r\nThe infrastructure is external to the system executing the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyTypeCode.mmObject();
			codeName = "ECSD";
		}
	};
	final static private LinkedHashMap<String, SystemPartyTypeCode> codesByName = new LinkedHashMap<>();

	protected SystemPartyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CSDY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemPartyTypeCode";
				definition = "Specifies the type of the party within a system.";
				derivation_lazy = () -> Arrays.asList(SystemPartyType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemPartyTypeCode.CentralSecuritiesDepository, com.tools20022.repository.codeset.SystemPartyTypeCode.NationalCentralBank,
						com.tools20022.repository.codeset.SystemPartyTypeCode.PaymentBank, com.tools20022.repository.codeset.SystemPartyTypeCode.CentralSecuritiesDepositoryParticipant,
						com.tools20022.repository.codeset.SystemPartyTypeCode.ExternalCentralSecuritiesDepository);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CentralSecuritiesDepository.getCodeName().get(), CentralSecuritiesDepository);
		codesByName.put(NationalCentralBank.getCodeName().get(), NationalCentralBank);
		codesByName.put(PaymentBank.getCodeName().get(), PaymentBank);
		codesByName.put(CentralSecuritiesDepositoryParticipant.getCodeName().get(), CentralSecuritiesDepositoryParticipant);
		codesByName.put(ExternalCentralSecuritiesDepository.getCodeName().get(), ExternalCentralSecuritiesDepository);
	}

	public static SystemPartyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemPartyTypeCode[] values() {
		SystemPartyTypeCode[] values = new SystemPartyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemPartyTypeCode> {
		@Override
		public SystemPartyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemPartyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}