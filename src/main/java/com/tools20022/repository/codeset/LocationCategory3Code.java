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
import com.tools20022.repository.codeset.LocationCategory3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of integration of the POI terminal in the sale
 * environment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#Indoor
 * LocationCategory3Code.Indoor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#InsidePump
 * LocationCategory3Code.InsidePump}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#MultiplePOITerminal
 * LocationCategory3Code.MultiplePOITerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#MultiplePump
 * LocationCategory3Code.MultiplePump}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#MultipleSaleTerminal
 * LocationCategory3Code.MultipleSaleTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#SingleSaleTerminal
 * LocationCategory3Code.SingleSaleTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code#VendingMachine
 * LocationCategory3Code.VendingMachine}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LocationCategory3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of integration of the POI terminal in the sale environment."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LocationCategory3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indoor"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code Indoor = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indoor";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.Indoor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsidePump"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code InsidePump = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsidePump";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.InsidePump.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiplePOITerminal"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code MultiplePOITerminal = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplePOITerminal";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.MultiplePOITerminal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiplePump"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code MultiplePump = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplePump";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.MultiplePump.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSaleTerminal"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code MultipleSaleTerminal = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSaleTerminal";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.MultipleSaleTerminal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSaleTerminal"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code SingleSaleTerminal = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSaleTerminal";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.SingleSaleTerminal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendingMachine"</li>
	 * </ul>
	 */
	public static final LocationCategory3Code VendingMachine = new LocationCategory3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendingMachine";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory3Code.mmObject();
			codeName = LocationCategoryCode.VendingMachine.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LocationCategory3Code> codesByName = new LinkedHashMap<>();

	protected LocationCategory3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocationCategory3Code";
				definition = "Indicates the type of integration of the POI terminal in the sale environment.";
				trace_lazy = () -> LocationCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LocationCategory3Code.Indoor, com.tools20022.repository.codeset.LocationCategory3Code.InsidePump,
						com.tools20022.repository.codeset.LocationCategory3Code.MultiplePOITerminal, com.tools20022.repository.codeset.LocationCategory3Code.MultiplePump,
						com.tools20022.repository.codeset.LocationCategory3Code.MultipleSaleTerminal, com.tools20022.repository.codeset.LocationCategory3Code.SingleSaleTerminal,
						com.tools20022.repository.codeset.LocationCategory3Code.VendingMachine);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Indoor.getCodeName().get(), Indoor);
		codesByName.put(InsidePump.getCodeName().get(), InsidePump);
		codesByName.put(MultiplePOITerminal.getCodeName().get(), MultiplePOITerminal);
		codesByName.put(MultiplePump.getCodeName().get(), MultiplePump);
		codesByName.put(MultipleSaleTerminal.getCodeName().get(), MultipleSaleTerminal);
		codesByName.put(SingleSaleTerminal.getCodeName().get(), SingleSaleTerminal);
		codesByName.put(VendingMachine.getCodeName().get(), VendingMachine);
	}

	public static LocationCategory3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LocationCategory3Code[] values() {
		LocationCategory3Code[] values = new LocationCategory3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LocationCategory3Code> {
		@Override
		public LocationCategory3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LocationCategory3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}