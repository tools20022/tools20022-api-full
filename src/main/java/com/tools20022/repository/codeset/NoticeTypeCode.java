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
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined notice
 * type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NoticeTypeCode#mmUniversal
 * NoticeTypeCode.mmUniversal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NoticeTypeCode#mmCedeAndCo
 * NoticeTypeCode.mmCedeAndCo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NoticeType1Code
 * NoticeType1Code}</li>
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
 * <li>"UNVL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NoticeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined notice type."
 * </li>
 * </ul>
 */
public class NoticeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Notice is universal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticeTypeCode
	 * NoticeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Universal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notice is universal."</li>
	 * </ul>
	 */
	public static final MMCode mmUniversal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Universal";
			definition = "Notice is universal.";
			owner_lazy = () -> NoticeTypeCode.mmObject();
			codeName = "UNVL";
		}
	};
	/**
	 * Notice is specific to the securities registered in DTC's (The Depository
	 * Trust Company) nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticeTypeCode
	 * NoticeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CedeAndCo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notice is specific to the securities registered in DTC's (The Depository Trust Company) nominee name."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCedeAndCo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CedeAndCo";
			definition = "Notice is specific to the securities registered in DTC's (The Depository Trust Company) nominee name.";
			owner_lazy = () -> NoticeTypeCode.mmObject();
			codeName = "CEDE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UNVL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NoticeTypeCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined notice type.";
				code_lazy = () -> Arrays.asList(NoticeTypeCode.mmUniversal, NoticeTypeCode.mmCedeAndCo);
				derivation_lazy = () -> Arrays.asList(NoticeType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}