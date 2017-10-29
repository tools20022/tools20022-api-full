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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of changes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#BearToRegistered
 * CorporateActionChangeTypeCode.BearToRegistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#Certificates
 * CorporateActionChangeTypeCode.Certificates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#DematerialisedToPhysical
 * CorporateActionChangeTypeCode.DematerialisedToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#GlobalPermanentToPhysical
 * CorporateActionChangeTypeCode.GlobalPermanentToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#GlobalTemporaryToGlobalPermanent
 * CorporateActionChangeTypeCode.GlobalTemporaryToGlobalPermanent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#GlobalTemporaryToPhysical
 * CorporateActionChangeTypeCode.GlobalTemporaryToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#Name
 * CorporateActionChangeTypeCode.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#PhysicalToDematerialised
 * CorporateActionChangeTypeCode.PhysicalToDematerialised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#RegisteredToBearer
 * CorporateActionChangeTypeCode.RegisteredToBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#Terms
 * CorporateActionChangeTypeCode.Terms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode#Decimalisation
 * CorporateActionChangeTypeCode.Decimalisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
 * CorporateActionChangeType2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType1Code
 * CorporateActionChangeType1Code}</li>
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
 * <li>"BERE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionChangeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of changes."</li>
 * </ul>
 */
public class CorporateActionChangeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Change from bearer into registered form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BERE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearToRegistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from bearer into registered form."</li>
	 * </ul>
	 */
	public static final MMCode BearToRegistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BearToRegistered";
			definition = "Change from bearer into registered form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "BERE";
		}
	};
	/**
	 * Change of all instruments into certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change of all instruments into certificates."</li>
	 * </ul>
	 */
	public static final MMCode Certificates = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certificates";
			definition = "Change of all instruments into certificates.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Change from dematerialised into physical form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedToPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from dematerialised into physical form."</li>
	 * </ul>
	 */
	public static final MMCode DematerialisedToPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedToPhysical";
			definition = "Change from dematerialised into physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "DEPH";
		}
	};
	/**
	 * Change from global permanent to physical form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GPPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalPermanentToPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from global permanent to physical form."</li>
	 * </ul>
	 */
	public static final MMCode GlobalPermanentToPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalPermanentToPhysical";
			definition = "Change from global permanent to physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GPPH";
		}
	};
	/**
	 * Change from global temporary to global permanent form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToGlobalPermanent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from global temporary to global permanent form."</li>
	 * </ul>
	 */
	public static final MMCode GlobalTemporaryToGlobalPermanent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalTemporaryToGlobalPermanent";
			definition = "Change from global temporary to global permanent form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GTGP";
		}
	};
	/**
	 * Change from global temporary to physical form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToPhysical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from global temporary to physical form."</li>
	 * </ul>
	 */
	public static final MMCode GlobalTemporaryToPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalTemporaryToPhysical";
			definition = "Change from global temporary to physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GTPH";
		}
	};
	/**
	 * The issuing company changes its name. CA event shows the change from old
	 * name to new name and may involve surrendering physical shares with the
	 * old name to the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Name = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "NAME";
		}
	};
	/**
	 * Change from physical into dematerialised form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalToDematerialised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from physical into dematerialised form."</li>
	 * </ul>
	 */
	public static final MMCode PhysicalToDematerialised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalToDematerialised";
			definition = "Change from physical into dematerialised form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "PHDE";
		}
	};
	/**
	 * Change from registered into bearer form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredToBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change from registered into bearer form."</li>
	 * </ul>
	 */
	public static final MMCode RegisteredToBearer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredToBearer";
			definition = "Change from registered into bearer form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "REBE";
		}
	};
	/**
	 * Change in the terms of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in the terms of the security."</li>
	 * </ul>
	 */
	public static final MMCode Terms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Terms";
			definition = "Change in the terms of the security.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Process of changing the accounting method of a security, eg, mutual fund,
	 * from units to a quantity with decimals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process of changing the accounting method of a security, eg, mutual fund, from units to a quantity with decimals."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Decimalisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Decimalisation";
			definition = "Process of changing the accounting method of a security, eg, mutual fund, from units to a quantity with decimals.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "DECI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BERE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionChangeTypeCode";
				definition = "Specifies the type of changes.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionChangeTypeCode.BearToRegistered, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Certificates,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.DematerialisedToPhysical, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.GlobalPermanentToPhysical,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.GlobalTemporaryToGlobalPermanent, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.GlobalTemporaryToPhysical,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Name, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.PhysicalToDematerialised,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.RegisteredToBearer, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Terms,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Decimalisation);
				derivation_lazy = () -> Arrays.asList(CorporateActionChangeType2Code.mmObject(), CorporateActionChangeType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}