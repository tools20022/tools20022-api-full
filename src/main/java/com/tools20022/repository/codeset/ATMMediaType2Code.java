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
import com.tools20022.repository.codeset.ATMMediaType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of media inside an ATM cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Cards
 * ATMMediaType2Code.Cards}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Coins
 * ATMMediaType2Code.Coins}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Commodity
 * ATMMediaType2Code.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Coupons
 * ATMMediaType2Code.Coupons}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Notes
 * ATMMediaType2Code.Notes}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Stamps
 * ATMMediaType2Code.Stamps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Undetermined
 * ATMMediaType2Code.Undetermined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Check
 * ATMMediaType2Code.Check}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
 * ATMMediaTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMMediaType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of media inside an ATM cassette."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
 * ATMMediaType1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMMediaType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cards"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Cards
	 * ATMMediaType1Code.Cards}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Cards = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cards";
			previousVersion_lazy = () -> ATMMediaType1Code.Cards;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Cards.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coins"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Coins
	 * ATMMediaType1Code.Coins}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Coins = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coins";
			previousVersion_lazy = () -> ATMMediaType1Code.Coins;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Coins.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Commodity
	 * ATMMediaType1Code.Commodity}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Commodity = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			previousVersion_lazy = () -> ATMMediaType1Code.Commodity;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Commodity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coupons"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Coupons
	 * ATMMediaType1Code.Coupons}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Coupons = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coupons";
			previousVersion_lazy = () -> ATMMediaType1Code.Coupons;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Coupons.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Notes
	 * ATMMediaType1Code.Notes}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Notes = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notes";
			previousVersion_lazy = () -> ATMMediaType1Code.Notes;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Notes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stamps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Stamps
	 * ATMMediaType1Code.Stamps}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Stamps = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stamps";
			previousVersion_lazy = () -> ATMMediaType1Code.Stamps;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Stamps.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undetermined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Undetermined
	 * ATMMediaType1Code.Undetermined}</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Undetermined = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undetermined";
			previousVersion_lazy = () -> ATMMediaType1Code.Undetermined;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Undetermined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Check"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMMediaType2Code Check = new ATMMediaType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Check";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType2Code.mmObject();
			codeName = ATMMediaTypeCode.Check.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMMediaType2Code> codesByName = new LinkedHashMap<>();

	protected ATMMediaType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMMediaType2Code";
				definition = "Type of media inside an ATM cassette.";
				previousVersion_lazy = () -> ATMMediaType1Code.mmObject();
				trace_lazy = () -> ATMMediaTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMMediaType2Code.Cards, com.tools20022.repository.codeset.ATMMediaType2Code.Coins, com.tools20022.repository.codeset.ATMMediaType2Code.Commodity,
						com.tools20022.repository.codeset.ATMMediaType2Code.Coupons, com.tools20022.repository.codeset.ATMMediaType2Code.Notes, com.tools20022.repository.codeset.ATMMediaType2Code.Stamps,
						com.tools20022.repository.codeset.ATMMediaType2Code.Undetermined, com.tools20022.repository.codeset.ATMMediaType2Code.Check);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cards.getCodeName().get(), Cards);
		codesByName.put(Coins.getCodeName().get(), Coins);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Coupons.getCodeName().get(), Coupons);
		codesByName.put(Notes.getCodeName().get(), Notes);
		codesByName.put(Stamps.getCodeName().get(), Stamps);
		codesByName.put(Undetermined.getCodeName().get(), Undetermined);
		codesByName.put(Check.getCodeName().get(), Check);
	}

	public static ATMMediaType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMMediaType2Code[] values() {
		ATMMediaType2Code[] values = new ATMMediaType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMMediaType2Code> {
		@Override
		public ATMMediaType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMMediaType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}