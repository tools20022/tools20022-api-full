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
 * Specifies the type of bonds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#mmSovereignBond
 * BondTypeCode.mmSovereignBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#mmNonEuropeanSovereignBond
 * BondTypeCode.mmNonEuropeanSovereignBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#mmOtherPublicBond
 * BondTypeCode.mmOtherPublicBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#mmConvertibleBond
 * BondTypeCode.mmConvertibleBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondTypeCode#mmCoveredBond
 * BondTypeCode.mmCoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#mmCorporateBond
 * BondTypeCode.mmCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#mmOtherNonEuropeanPublicBond
 * BondTypeCode.mmOtherNonEuropeanPublicBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondTypeCode#mmOther
 * BondTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BondType1Code
 * BondType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BondTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of bonds."</li>
 * </ul>
 */
public class BondTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Bond of type sovereign bond.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type sovereign bond.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSovereignBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignBond";
			definition = "Bond of type sovereign bond.\r\n";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "EUSB";
		}
	};
	/**
	 * Bond of type non-european sovereign bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NESB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEuropeanSovereignBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type non-european sovereign bond."</li>
	 * </ul>
	 */
	public static final MMCode mmNonEuropeanSovereignBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEuropeanSovereignBond";
			definition = "Bond of type non-european sovereign bond.";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "NESB";
		}
	};
	/**
	 * Bond of type other public bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OEPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPublicBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type other public bond."</li>
	 * </ul>
	 */
	public static final MMCode mmOtherPublicBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPublicBond";
			definition = "Bond of type other public bond.";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "OEPB";
		}
	};
	/**
	 * Bond of type convertible bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type convertible bond."</li>
	 * </ul>
	 */
	public static final MMCode mmConvertibleBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleBond";
			definition = "Bond of type convertible bond.";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "CVTB";
		}
	};
	/**
	 * Bond of type covered Bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type covered Bond."</li>
	 * </ul>
	 */
	public static final MMCode mmCoveredBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			definition = "Bond of type covered Bond.";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "CVDB";
		}
	};
	/**
	 * Bond of type corporate Bond.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type corporate Bond.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			definition = "Bond of type corporate Bond.\r\n";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "CRPB";
		}
	};
	/**
	 * Bond of type other non-european public bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonEuropeanPublicBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type other non-european public bond."</li>
	 * </ul>
	 */
	public static final MMCode mmOtherNonEuropeanPublicBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonEuropeanPublicBond";
			definition = "Bond of type other non-european public bond.";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "ONEP";
		}
	};
	/**
	 * Other bond type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other bond type."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other bond type.";
			owner_lazy = () -> BondTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BondTypeCode";
				definition = "Specifies the type of bonds.";
				code_lazy = () -> Arrays.asList(BondTypeCode.mmSovereignBond, BondTypeCode.mmNonEuropeanSovereignBond, BondTypeCode.mmOtherPublicBond, BondTypeCode.mmConvertibleBond, BondTypeCode.mmCoveredBond,
						BondTypeCode.mmCorporateBond, BondTypeCode.mmOtherNonEuropeanPublicBond, BondTypeCode.mmOther);
				derivation_lazy = () -> Arrays.asList(BondType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}