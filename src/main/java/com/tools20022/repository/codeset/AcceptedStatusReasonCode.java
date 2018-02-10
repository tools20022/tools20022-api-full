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
import com.tools20022.repository.codeset.AcceptedStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for an accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReasonCode#SectorNotAllowed
 * AcceptedStatusReasonCode.SectorNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReasonCode#PlaceNotAllowed
 * AcceptedStatusReasonCode.PlaceNotAllowed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AcceptedStatusReason1Code
 * AcceptedStatusReason1Code}</li>
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
 * "AcceptedStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for an accepted status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AcceptedStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the account modification instruction is accepted but
	 * modification of the account data will not be carried out for the sector
	 * code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReasonCode
	 * AcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SectorNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the account modification instruction is accepted but modification of the account data will not be carried out for the sector code."
	 * </li>
	 * </ul>
	 */
	public static final AcceptedStatusReasonCode SectorNotAllowed = new AcceptedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SectorNotAllowed";
			definition = "Status of the account modification instruction is accepted but modification of the account data will not be carried out for the sector code.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcceptedStatusReasonCode.mmObject();
			codeName = "SECT";
		}
	};
	/**
	 * Status of the account modification instruction is accepted but
	 * modification of the account data will not be carried out for the place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReasonCode
	 * AcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the account modification instruction is accepted but modification of the account data will not be carried out for the place."
	 * </li>
	 * </ul>
	 */
	public static final AcceptedStatusReasonCode PlaceNotAllowed = new AcceptedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceNotAllowed";
			definition = "Status of the account modification instruction is accepted but modification of the account data will not be carried out for the place.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcceptedStatusReasonCode.mmObject();
			codeName = "PLAC";
		}
	};
	final static private LinkedHashMap<String, AcceptedStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected AcceptedStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptedStatusReasonCode";
				definition = "Specifies the reason for an accepted status.";
				derivation_lazy = () -> Arrays.asList(AcceptedStatusReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AcceptedStatusReasonCode.SectorNotAllowed, com.tools20022.repository.codeset.AcceptedStatusReasonCode.PlaceNotAllowed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SectorNotAllowed.getCodeName().get(), SectorNotAllowed);
		codesByName.put(PlaceNotAllowed.getCodeName().get(), PlaceNotAllowed);
	}

	public static AcceptedStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AcceptedStatusReasonCode[] values() {
		AcceptedStatusReasonCode[] values = new AcceptedStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AcceptedStatusReasonCode> {
		@Override
		public AcceptedStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AcceptedStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}