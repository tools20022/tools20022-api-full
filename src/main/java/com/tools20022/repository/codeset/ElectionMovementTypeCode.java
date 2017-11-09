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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the effect on the holdings of electing a Corporate Action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ElectionMovementType2Code
 * ElectionMovementType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ElectionMovementType1Code
 * ElectionMovementType1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode#mmRestricted
 * ElectionMovementTypeCode.mmRestricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode#mmDirect
 * ElectionMovementTypeCode.mmDirect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode#mmSequestered
 * ElectionMovementTypeCode.mmSequestered}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ElectionMovementTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the effect on the holdings of electing a Corporate Action option."
 * </li>
 * </ul>
 */
public class ElectionMovementTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Election results in a change of balance type that transfers control of
	 * the securities rather than the securities themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
	 * ElectionMovementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Election results in a change of balance type that transfers control of the securities rather than the securities themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRestricted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Election results in a change of balance type that transfers control of the securities rather than the securities themselves.";
			owner_lazy = () -> ElectionMovementTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Direct movement of resource, ie, cash or security that is directly
	 * credited to the paying agent account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
	 * ElectionMovementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct movement of resource, ie, cash or security that is directly credited to the paying agent account."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDirect = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Direct";
			definition = "Direct movement of resource, ie, cash or security that is directly credited to the paying agent account.";
			owner_lazy = () -> ElectionMovementTypeCode.mmObject();
			codeName = "DRCT";
		}
	};
	/**
	 * Election results in a change of balance type that transfers control of
	 * the securities rather than the securities themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
	 * ElectionMovementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sequestered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Election results in a change of balance type that transfers control of the securities rather than the securities themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSequestered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sequestered";
			definition = "Election results in a change of balance type that transfers control of the securities rather than the securities themselves.";
			owner_lazy = () -> ElectionMovementTypeCode.mmObject();
			codeName = "SEQD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectionMovementTypeCode";
				definition = "Specifies the effect on the holdings of electing a Corporate Action option.";
				code_lazy = () -> Arrays.asList(ElectionMovementTypeCode.mmRestricted, ElectionMovementTypeCode.mmDirect, ElectionMovementTypeCode.mmSequestered);
				derivation_lazy = () -> Arrays.asList(ElectionMovementType2Code.mmObject(), ElectionMovementType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}