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
import com.tools20022.repository.codeset.LocationCategory1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Location category code of the place where the merchant actually performed the
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code#Fixed
 * LocationCategory1Code.Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code#Aboard
 * LocationCategory1Code.Aboard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code#Nomadic
 * LocationCategory1Code.Nomadic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code#MailOrderTelephoneOrder
 * LocationCategory1Code.MailOrderTelephoneOrder}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LocationCategory1Code#Home
 * LocationCategory1Code.Home}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
 * LocationCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIXD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LocationCategory1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Location category code of the place where the merchant actually performed the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LocationCategory1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * </ul>
	 */
	public static final LocationCategory1Code Fixed = new LocationCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory1Code.mmObject();
			codeName = LocationCategoryCode.Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aboard"</li>
	 * </ul>
	 */
	public static final LocationCategory1Code Aboard = new LocationCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aboard";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory1Code.mmObject();
			codeName = LocationCategoryCode.Aboard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nomadic"</li>
	 * </ul>
	 */
	public static final LocationCategory1Code Nomadic = new LocationCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nomadic";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory1Code.mmObject();
			codeName = LocationCategoryCode.Nomadic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrderTelephoneOrder"</li>
	 * </ul>
	 */
	public static final LocationCategory1Code MailOrderTelephoneOrder = new LocationCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailOrderTelephoneOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory1Code.mmObject();
			codeName = LocationCategoryCode.MailOrderTelephoneOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Home"</li>
	 * </ul>
	 */
	public static final LocationCategory1Code Home = new LocationCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Home";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory1Code.mmObject();
			codeName = LocationCategoryCode.Home.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LocationCategory1Code> codesByName = new LinkedHashMap<>();

	protected LocationCategory1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIXD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocationCategory1Code";
				definition = "Location category code of the place where the merchant actually performed the transaction.";
				trace_lazy = () -> LocationCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LocationCategory1Code.Fixed, com.tools20022.repository.codeset.LocationCategory1Code.Aboard, com.tools20022.repository.codeset.LocationCategory1Code.Nomadic,
						com.tools20022.repository.codeset.LocationCategory1Code.MailOrderTelephoneOrder, com.tools20022.repository.codeset.LocationCategory1Code.Home);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Aboard.getCodeName().get(), Aboard);
		codesByName.put(Nomadic.getCodeName().get(), Nomadic);
		codesByName.put(MailOrderTelephoneOrder.getCodeName().get(), MailOrderTelephoneOrder);
		codesByName.put(Home.getCodeName().get(), Home);
	}

	public static LocationCategory1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LocationCategory1Code[] values() {
		LocationCategory1Code[] values = new LocationCategory1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LocationCategory1Code> {
		@Override
		public LocationCategory1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LocationCategory1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}